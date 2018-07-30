package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public	class	HomeController	{
	
		@ResponseBody
		@RequestMapping("/hello")
		public	String	hello()	{
			return	"Hello	world";
		}
		
		@RequestMapping("/helloView")
		public String helloView () {
			return "home";
		}
	
}