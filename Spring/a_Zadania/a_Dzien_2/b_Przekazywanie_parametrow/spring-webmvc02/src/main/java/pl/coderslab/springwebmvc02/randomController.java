package pl.coderslab.springwebmvc02;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class randomController {

	private final Random rand = new Random();
	
	@RequestMapping("/random/{min}-{max}")
	@ResponseBody
	String randomInRange (@PathVariable int min, @PathVariable int max) {
		return "Użytkownik podał zakres: " + min + " i " + max + ". Wylosowano liczbę: " + (rand.nextInt(max-min)+min+1);
	}
}
