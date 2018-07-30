import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_04() {
        super();
        // TODO Auto-generated constructor stub
    }
        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
                final String cookieName = "visited";
                Cookie[] cookies = request.getCookies();
                int counter = 1;
                Cookie ourCookie = null;         
                if(cookies!=null) {
                for(Cookie cookie: cookies) {
                        if(cookieName.equals(cookie.getName())) {
                                try {
                                        counter = Integer.parseInt(cookie.getValue());
                                        counter++;
                                        response.getWriter().append("Ojej, juz jesteś "+ counter + " raz, nuuuda!");
                                        ourCookie = cookie;
                                        ourCookie.setValue(Integer.toString(counter));
                                }catch(Exception e) {
                                        System.out.println(e);
                                }finally{
                                        break;
                                }
                        }
                }
                }
                if(ourCookie == null) {
                        response.getWriter().append("Witaj!!!!!");
                        ourCookie = new Cookie(
                                        cookieName, 
                                        Integer.toString(counter)
                                        );
                }
                ourCookie.setMaxAge(60*60*24*365);
                response.addCookie(ourCookie);                      
        }
}