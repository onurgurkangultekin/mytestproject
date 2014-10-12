package ogg.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogg.dao.FilmDao;
import ogg.entity.Film;

@WebServlet("/filmdetay")
public class FilmDetayServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int filmId = Integer.parseInt( req.getParameter("filmid"));
		Film film = new FilmDao().OkuFilm(filmId);
		req.setAttribute("film", film);
		req.getRequestDispatcher("filmdetay.jsp").forward(req, resp);
	}
	

}
