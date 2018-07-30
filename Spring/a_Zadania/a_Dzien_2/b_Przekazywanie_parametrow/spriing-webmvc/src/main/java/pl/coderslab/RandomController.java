package pl.coderslab;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class RandomController {

    @RequestMapping("/show")
    @ResponseBody
    String showRandom() {
    	Random numb = new Random();
    	int number = numb.nextInt(100) + 1;
        return "Wylosowano liczbę: " + number;
    }    
}
