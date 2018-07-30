

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_1_c_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	static boolean something=true;
		
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1_c_04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		while(something==true) { 
		System.out.println(something);
		something=false;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
//	public void init() {
//	System.out.println("Zadanie 4");
//	}
}
