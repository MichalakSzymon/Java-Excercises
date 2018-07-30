package pl.coderslab.springwebmvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NameController {

	@RequestMapping("/sayHello/{firstName}/{lastName}")
	@ResponseBody
	String sayHello (@PathVariable String firstName, @PathVariable String lastName) {
		return "Witaj " + firstName + " " + lastName;
	}
	
}

