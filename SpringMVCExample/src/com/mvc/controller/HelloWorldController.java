package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Hello world!! This is our first Spring MVC web Application";
		return new ModelAndView("welcome", "message", message);
	}
}
