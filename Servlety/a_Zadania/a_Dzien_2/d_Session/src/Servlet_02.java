

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class Session_2
 */
@WebServlet("/counter")
public class Servlet_02 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_02() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                PrintWriter out = response.getWriter();
                out.append("<div><form method='post'><input type='number' name='score' placeholder='wpisz ocene 1-6'><input type='submit' value='Wyslij'></form>");
                HttpSession sess = request.getSession();
                List<Integer> scoreArray;
                
                scoreArray = (List<Integer>) sess.getAttribute("scoreArray");
                if(scoreArray != null) {
                        int sum = 0;
                        for(int score: scoreArray) {
                                sum += score;
                        }
                        double result = (double)sum/scoreArray.size();
                        out.append("<h1>Srednia ocen:" + result+ "</h1>");
                }
                out.append("</div>");
        }
        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                HttpSession sess = request.getSession();
                List<Integer> scoreArray = (List<Integer>) sess.getAttribute("scoreArray");
                if(scoreArray == null) {
                        scoreArray = new ArrayList<Integer>();
                }
                String raw_score = request.getParameter("score");
                try {
                        int score = Integer.parseInt(raw_score);
                        if(score>0 && score<7) {
                                scoreArray.add(score);
                                sess.setAttribute("scoreArray", scoreArray);
                        }
                }catch(Exception e) {
                        System.out.println("zła ocena:" + e);
                }
                doGet(request, response);
        }

}
