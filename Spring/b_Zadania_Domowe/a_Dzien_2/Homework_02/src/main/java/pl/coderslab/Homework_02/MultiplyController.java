package pl.coderslab.Homework_02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

	@RequestMapping("/multiply/{size}") 
	public	String	multiply(Model	model, @PathVariable String size, HttpServletRequest request )	{
		model.addAttribute("size",	size);
		return	"multiply";
		}

	@RequestMapping("/paramMultiply/{rows}/{cols}") 
	public	String	paramMultiply(Model	model, @PathVariable String rows, @PathVariable String cols, HttpServletRequest request )	{
		model.addAttribute("rows",	rows);
		model.addAttribute("cols",	cols);
		return	"parammultiply";
		}
}