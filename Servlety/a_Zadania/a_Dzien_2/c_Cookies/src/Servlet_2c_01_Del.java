

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_2c_01_Del
 */
@WebServlet("/Servlet_2c_01_Del")
public class Servlet_2c_01_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_2c_01_Del() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie cookie = new Cookie("user", "CodersLab");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		PrintWriter out = response.getWriter();
		Cookie [] cookies = request.getCookies();
		String result = "Nie ma ciasteczka";
		for(Cookie c: cookies) {
			if ("user".equals(c.getName())) { 
				result = c.getValue();
				c.setMaxAge(0);
				response.addCookie(c);
				break;
			}
		}
		response.getWriter().append("<div> Served at: ").append(request.getContextPath()).append("<h1>").append(result).append("</h1>").append("</div>");	
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
