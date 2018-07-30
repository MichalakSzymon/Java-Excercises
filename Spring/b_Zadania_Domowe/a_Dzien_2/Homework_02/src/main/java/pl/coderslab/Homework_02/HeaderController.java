package pl.coderslab.Homework_02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeaderController {

	@RequestMapping("/showUserAgent")
	@ResponseBody
	public	String	userAgent(Model	model, @RequestHeader("user-agent") String agent)	{
		model.addAttribute("header", agent);
		return "userAgent";
	}
}
