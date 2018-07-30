

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_2b_04
 */
@WebServlet("/Servlet_2b_04")
public class Servlet_2b_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_2b_04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random generator = new Random();
		PrintWriter out = response.getWriter();
		Integer ile = generator.nextInt(5)+5; 
		out.append("<div><form action=\"http://localhost:8080/Servlets_2/Servlet_2b_04\" method=\"post\">");
		for(Integer i=0; i<ile; i++)
		response.getWriter().append("<input type=\"number\" name=\"number\">");	
		out.append("<input type=\"submit\" name=\"submit\"> </form> </div>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String [] tab = request.getParameterValues("number");
		System.out.println(tab);
		Integer [] tabInt = new Integer [tab.length];
		int pos=0;
		for(String subtab : tab) {
			tabInt[pos]=Integer.parseInt(subtab);
			pos++;
		}
		Arrays.sort(tabInt);
		for(Integer i: tabInt)
		response.getWriter().append(i.toString()).append(" ");	
	}

}
