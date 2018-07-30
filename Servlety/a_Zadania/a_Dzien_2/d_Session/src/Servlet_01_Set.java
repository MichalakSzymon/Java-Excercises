

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_01_Set
 */
@WebServlet("/Servlet_01_Set")
public class Servlet_01_Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_01_Set() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.append("<div><form method='post'><input type='number' name='ocena' placeholder='wpisz ocene 1-6'><input type='submit' value='Wyslij'></form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		List<Integer> scoreArray;
		if(sess.isNew()) {
			scoreArray = new ArrayList<>();
		}
		else {
			scoreArray = (List<Integer>) sess.getAttribute("scoreArray"); 
		}
		String raw_score = request.getParameter("ocena");
		try {
			int score = Integer.parseInt(raw_score);
			if(score>0 && score<7) {
				scoreArray.add(score);
			}
		} catch (Exception e) {
			System.out.println("zła ocena" + raw_score);
		}
	}

}
