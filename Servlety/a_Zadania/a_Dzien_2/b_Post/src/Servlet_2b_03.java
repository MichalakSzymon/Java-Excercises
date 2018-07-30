

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_2b_03
 */
@WebServlet("/Servlet_2b_03")
public class Servlet_2b_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_2b_03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double a = Double.parseDouble(request.getParameter("a"));
		Double b = Double.parseDouble(request.getParameter("b"));
		Double c = Double.parseDouble(request.getParameter("c"));
		Double delta=b*b-4*a*c;
		if(delta==0) {
			Double x=-b/(2*a); 
			response.getWriter().append("Miejsca zerowe: ").append(x.toString()).append(", ");
		}
		else if(delta>0) {
			Double x1 = (-b-Math.sqrt(delta)/(2*a));
			Double x2 = (-b+Math.sqrt(delta)/(2*a));
			response.getWriter().append("Miejsca zerowe: ").append(x1.toString()).append(", ").append(x2.toString());
		}
		if(delta<0) {
			response.getWriter().append("Nie ma miejsc zerowych");
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
