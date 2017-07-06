package com.SpringStarterApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		
		String message = "hello users";
		return new ModelAndView("welcome","message",message);
		
	}
	
}