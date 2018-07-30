import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(urlPatterns = "/Servlet1",  
initParams={@WebInitParam(name = "haslo", value= "sezamiezamknijsie")})
public class Servlet_1_c_05 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1_c_05() {
        super();
        // TODO Auto-generated constructor stub
    }

    private	String haslo="alamakota";
    public	void	init(ServletConfig	config)	throws	ServletException	{
    		haslo	=	config.getInitParameter("haslo");
    		super.init(config);
    		System.out.println("init: haslo: " + haslo);
    }
        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                response.setContentType("text/html; charset=UTF-8");
                
                Enumeration<String> headers = request.getHeaderNames();
                Map<String, String[]> parameterMap = request.getParameterMap();
                
                PrintWriter out = response.getWriter();
                
                out
                .append("<div>")
                .append("<h1>")
                .append("Zażółć jaźnią żółć at: ")
                .append(request.getContextPath())
                .append("</h1><ul>");
                String headerName;
                while(headers.hasMoreElements()){
                        headerName = headers.nextElement();
                        out
                        .append("<li>")
                        .append(headerName)
                        .append(": ")
                        .append(request.getHeader(headerName))
                        .append("</li>");
                }
                out.append("</ul><ul>");
                for(Iterator<String> it = parameterMap.keySet().iterator(); it.hasNext();) {
                        String name = it.next();
                        out
                        .append("<li>")
                        .append(name)
                        .append(":<ul>");
                        
                        for(String val: parameterMap.get(name)) {
                                out
                                .append("<li>")
                                .append(val)
                                .append("</li>");
                        }
                        out.append("</ul></li>");
                
                }
                out.append("</ul></div>");
        
        
                Calendar today = new GregorianCalendar();
                
                out.println("<div><h1>Eclipse servlet</h1>"
                			+today.get(Calendar.DAY_OF_MONTH)+"-"
                			+(1+ today.get(Calendar.MONTH)) + "-"
                			+today.get(Calendar.YEAR) + "</div>"
                		);
                
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}