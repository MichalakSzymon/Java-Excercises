

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_03_1
 */
@WebServlet("/Servlet_03_1")
public class Servlet_03_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_03_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.getWriter().append("<div><form name=\"loginForm\" method=\"get\" action=\"http://localhost:8080/ProjectHomework/Servlet_03_2\">"+
		"id: <input type=\"text\" name=\"id\"/>"
		+ "<input type=\"submit\" value=\"Send\"/>"
		+ "</input>"
		+ "</form>"
		+ "</div>");
		request.getParameter("id");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
