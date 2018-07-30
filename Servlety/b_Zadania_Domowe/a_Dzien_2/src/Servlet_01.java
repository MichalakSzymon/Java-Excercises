

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01
 */
@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		Double kwota = Double.parseDouble(request.getParameter("kwota"));
		switch(request.getParameter("waluta")) {
		case "EurUsd": {
			kwota*=(1.16);
		}
		case "UsdEur": {
			kwota*=(0.86);
		}	
		case "EurPln":	{
			kwota*=(4.25);
		}
		case "PlnEur": {
			kwota*=(0.23);
		}
		case "UsdPln": {
			kwota*=(3.66);
		}
		case "PlnUsd": {
			kwota*=(0.27);
		}
		out.append("Kwota po przeliczeniu: " + kwota);
			
		}
	}
}
