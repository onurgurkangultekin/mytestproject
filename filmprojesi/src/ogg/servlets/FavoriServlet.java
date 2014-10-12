package ogg.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogg.dao.FilmDao;
import ogg.entity.Film;

@WebServlet("/favori")
public class FavoriServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		int filmId = Integer.parseInt(req.getParameter("filmid"));
		Film film = new FilmDao().OkuFilm(filmId);
		
		HashMap<Integer, String> favoriler = new HashMap<Integer, String>();
		if (req.getSession().getAttribute("favoriler")!=null) {
			
			favoriler = (HashMap<Integer, String>)req.getSession().getAttribute("favoriler");
		}
		favoriler.putIfAbsent(film.getId(), film.getAd());
		
		req.getSession().setAttribute("favoriler", favoriler);
		req.getRequestDispatcher("filmdetay?filmid=" + filmId).forward(req, resp);
	}
	
}
