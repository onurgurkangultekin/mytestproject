package ogg.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogg.dao.FilmDao;
import ogg.entity.Film;

@WebServlet("/filmler")
public class FilmServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int kategoriid = Integer.parseInt(req.getParameter("kategoriid"));
		ArrayList<Film> filmler = new FilmDao().GetirFilm(kategoriid);
		req.getSession().setAttribute("filmler", filmler);
		req.getRequestDispatcher("filmler.jsp").forward(req, resp);
	}

}
