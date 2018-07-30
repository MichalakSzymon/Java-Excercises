

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlets_2c_02
 */
@WebServlet("/Servlets_2c_02")
public class Servlets_2c_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlets_2c_02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.append("<div><form action=\"http://localhost:8080/Cookies/Servlets_2c_02\" method=\"POST\"><label>Klucz:<input type=\"text\" name=\"key\"></label><label>Wartość:<input type=\"text\" name=\"value\"></label><input type=\"submit\"></form></div>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie = new Cookie(request.getParameter("key"), request.getParameter("value"));
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
	}

}
