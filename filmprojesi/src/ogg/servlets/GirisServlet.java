package ogg.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/giris")
public class GirisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public GirisServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kullaniciAdi = request.getParameter("kullaniciadi");
		String sifre = request.getParameter("sifre");
		
		if(sifre.equals("1234") && kullaniciAdi.equals("onur")){
			
			request.getSession().setAttribute("kullanici", kullaniciAdi);
			response.sendRedirect("home");
		}
		else {
			
			String mesajString = "kullanıcı adı veya şifre hatalı.";
			request.setAttribute("mesaj", mesajString);
			request.getRequestDispatcher("/uyegiris.jsp").forward(request, response);
		}
	}

}
