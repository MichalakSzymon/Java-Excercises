package pl.coderslab.springwebmvc02;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

@Controller
public class CookieController {

	@RequestMapping("/setCookie/{value1}/{value2}")
	public	String	cookies(HttpServletResponse	response, @PathVariable String value1, @PathVariable String value2){
		Cookie cookie1 = new	Cookie("cookie1", value1);
		cookie1.setPath("/");
		Cookie cookie2 = new	Cookie("cookie2", value2);
		cookie2.setPath("/");
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return	"redirect:/cookieGet";
	}
	
	@RequestMapping("/cookieGet")
	@ResponseBody
	public	String	home(HttpServletRequest	request){
			Cookie	c	=	WebUtils.getCookie(request,	"cookie1");
			Cookie	d	=	WebUtils.getCookie(request,	"cookie2");
			return	"cookie" + c.getName() + " " + c.getValue() + "/n" + "cookie" + d.getName() + " " + d.getValue();
	}
	
	
	
	
}
