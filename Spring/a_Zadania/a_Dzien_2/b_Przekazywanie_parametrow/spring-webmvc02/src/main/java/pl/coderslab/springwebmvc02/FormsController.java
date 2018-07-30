package pl.coderslab.springwebmvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormsController {

	@GetMapping("/form")
	String form() {
		return "form";
	}

	@PostMapping("/form")
	@ResponseBody
	String formPost(@RequestParam String paramName) {
		return "Wysłano: " + paramName;
	}
}
