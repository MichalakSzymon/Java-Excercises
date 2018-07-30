package pl.coderslab;
import org.springframework.web.bind.annotation.RequestMapping;

public class helloViewResolver {

	@RequestMapping("/helloViewResolver")
	public	String	home()	{
			return	"helloViewResolver.jsp";
	}
}
