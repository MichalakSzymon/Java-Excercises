

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_2_a_02
 */
@WebServlet("/Servlet_2_a_02")
public class Servlet_2_a_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_2_a_03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Integer width=5;
		Integer height=10;
		try {
		width=Integer.parseInt(request.getParameter("width"));
		height=Integer.parseInt(request.getParameter("height"));
		}
		catch (NumberFormatException e) {	
		}
		
		for(Integer i=1; i<=height; i++) {
			for(Integer j=1; j<=width; j++) {
				Integer ij= i*j;
				out.append(i.toString()).append("x").append(j.toString()).append("=").append(ij.toString()).append(" | ");		
			}
			out.append("\n");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
