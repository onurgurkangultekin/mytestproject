package ogg.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ogg.entity.Kategori;

public class KategoriDao extends BaseDao {

	public ArrayList<Kategori> GetirKategori(){
		
		ArrayList<Kategori> kategoriler = new ArrayList<Kategori>();
		
		if (connection!= null) {
			try {
				String sqlString ="select * from kategori";
				PreparedStatement statement = connection.prepareStatement(sqlString);
				ResultSet resultSet = statement.executeQuery();
				
				while (resultSet.next()) {
					Kategori kategori = new Kategori();
					kategori.setId(resultSet.getInt("id"));
					kategori.setAd(resultSet.getString("ad"));
					kategoriler.add(kategori);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		return kategoriler;
	}
}
