package pl.coderslab.Homework_02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@GetMapping("/first")
	public	String	first()	{
		return "first";
	}
	@RequestMapping("/second")
	public	String	first(HttpServletRequest request) {
	 return "redirect:third";
	}
	
	@GetMapping("/third")
	public	String	third()	{
		return "third";
	}

}
