

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_1_5
 */
@WebServlet("/Servlet_1_5")
public class Servlet_1_d_05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1_d_05() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Enumeration<String> headers = request.getHeaderNames();
		Map<String, String[]> parameterMap = request.getParameterMap();
        PrintWriter out = response.getWriter();
        String headerName;
        out.append(request.getHeader("user-agent"));
        
        
        if( request.getHeader("user-agent").contains("Chrome")) System.out.println("Chrome");
        if( request.getHeader("user-agent").contains("Firefox")) System.out.println("Firefox");
        if( request.getHeader("user-agent").contains("Safari")) System.out.println("Safari");
        if( request.getHeader("user-agent").contains("Opera")) System.out.println("Opera");
        
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
