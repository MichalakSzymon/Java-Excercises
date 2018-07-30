

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_03
 */
@WebServlet("/Servlet_03")
public class Servlet_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession	sess = request.getSession();
		
		if	(sess.isNew()) {
		out.append("<div><FORM METHOD='post'><div>"
				+ "<input type='text' name='jeden'>"
				+ "<input type='text' name='dwa'>"
				+ "<input type='text' name='trzy'>"
				+ "<input type='text' name='cztery'>"
				+ "<input type='text' name='piec'>"
				+ "<input type='submit' value='submit'>"
				+ "</div></form></div>");
		}
		else {
			out.append("<div><FORM METHOD='post'><div>"
					+ "<input type='text' name='jeden' value="+ sess.getAttribute("jeden") + ">"
					+ "<input type='text' name='dwa' value="+ sess.getAttribute("dwa") + ">"
					+ "<input type='text' name='trzy' value="+ sess.getAttribute("trzy") + ">" 
					+ "<input type='text' name='cztery' value="+ sess.getAttribute("cztery") + ">"
					+ "<input type='text' name='piec' value="+ sess.getAttribute("piec") + ">"
					+ "<input type='submit' value='submit'>"
					+ "</div></form></div>");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		sess.setAttribute("jeden",request.getParameter("jeden"));
		sess.setAttribute("dwa",request.getParameter("dwa"));
		sess.setAttribute("trzy",request.getParameter("trzy"));
		sess.setAttribute("cztery",request.getParameter("cztery"));
		sess.setAttribute("piec",request.getParameter("piec"));
		doGet(request, response);
	}
}
