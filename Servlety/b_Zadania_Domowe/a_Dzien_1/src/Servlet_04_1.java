

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04_1
 */
@WebServlet("/Servlet_04_1")
public class Servlet_04_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_04_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Integer suma=0;
		Integer srednia=0;
		Integer iloczyn=1;
		Integer req1 = Integer.parseInt(request.getParameter("1"));
		Integer req2 = Integer.parseInt(request.getParameter("2"));
		Integer req3 = Integer.parseInt(request.getParameter("3"));
		Integer req4 = Integer.parseInt(request.getParameter("4"));
		out.append("Liczby:").append("\n");
		out.append(request.getParameter("1")).append("\n");	
		out.append(request.getParameter("2")).append("\n");
		out.append(request.getParameter("3")).append("\n");
		out.append(request.getParameter("4")).append("\n");
		suma =req1+req2+req3+req4;
		iloczyn=req1*req2*req3*req4;
		srednia=suma/4;
		out.append("suma: ").append(suma.toString()).append("\n");
		out.append("srednia: ").append(srednia.toString()).append("\n");
		out.append("iloczyn: ").append(iloczyn.toString()).append("\n");
		
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
