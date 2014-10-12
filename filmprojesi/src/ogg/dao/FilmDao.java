package ogg.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ogg.entity.Film;
import ogg.entity.Kategori;
import ogg.entity.Yonetmen;

public class FilmDao extends BaseDao {

	public FilmDao() {
		super();
	}

	public ArrayList<Film> ButunFilmleriGetir() {

		ArrayList<Film> filmler = new ArrayList<Film>();

		if (connection != null) {
			String sqlString = "select * from film";
			PreparedStatement statement;
			try {
				statement = connection.prepareStatement(sqlString);
				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					Film film = new Film();

					film.setId(Integer.parseInt(resultSet.getString("film_id")));
					film.setAd(resultSet.getString("title"));
					filmler.add(film);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return filmler;
	}

	public ArrayList<Film> GetirFilm(int kategoriid) {
		ArrayList<Film> filmler = new ArrayList<Film>();
		if (connection != null) {
			String sqlString = "select f.id,f.ad from film f left join kategori k on f.kategoriid = k.id where f.kategoriid=?";
			
					
			try {
				PreparedStatement statement = connection.prepareStatement(sqlString);
				statement.setInt(1, kategoriid);
				ResultSet resultSet = statement.executeQuery();
				
				while (resultSet.next()) {
					
					Film film = new Film(resultSet.getInt("id"),resultSet.getString("ad"),0,null,null);
					filmler.add(film);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return filmler;
	}
	
	public Film OkuFilm(int filmId){
		
		Film film = new Film();
		
		if (connection != null) {
			String sqlString = "select f.id,f.ad,f.sene,y.ad as yonetmenad, y.soyad as yonetmensoyad, y.yas, k.ad as kategoriad from film f left join yonetmen y on f.yonetmenid = y.id left join kategori k on f.kategoriid = k.id where f.id=?";
			
			 try {
				PreparedStatement statement = connection.prepareStatement(sqlString);
				statement.setInt(1, filmId);
				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					
					Kategori kategori = new Kategori(0,resultSet.getString("kategoriad"));
					Yonetmen yonetmen = new Yonetmen(0,resultSet.getString("yonetmenad"),resultSet.getString("yonetmensoyad"),resultSet.getInt("yas"));
					film = new Film(resultSet.getInt("id"),resultSet.getString("ad"),resultSet.getInt("sene"),kategori,yonetmen);
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			 
		}
		
		return film;
	}
}
