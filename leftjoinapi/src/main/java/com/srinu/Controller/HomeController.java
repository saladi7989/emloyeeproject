package com.srinu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("home");
		return mvc;
		
	}

}
