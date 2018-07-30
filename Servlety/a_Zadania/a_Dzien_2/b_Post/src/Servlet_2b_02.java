

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_2b_02
 */
@WebServlet("/Servlet_2b_02")
public class Servlet_2b_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_2b_02() {
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
		PrintWriter out = response.getWriter();
		String str = request.getParameter("string");
		String check = request.getParameter("check");
		if(check!=null) {
			out.append(str);
		}
		else {
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			String token=st.nextToken();
			for(String wyrazy: lista.wulgaryzmy)
				if(token.equals(wyrazy)) 
					token="****";
			out.append(token).append(" ");
		}
		}
		}
}
