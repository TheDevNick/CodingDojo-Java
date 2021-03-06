package com.codingdojo.TheCode.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "home/index";
	}
	
	@PostMapping("/getcode")
	public String getcode(@RequestParam(value="textinput") String userInput) {
		String result ="";
		if(userInput.equals("bushido")) { 
			result= "redirect:/display";//redirecting to route display
		}else {
			result = "redirect:/createError";
		}
		return result;
	}
	
	@GetMapping("/display")
	public String display() {
		return "home/secret";
	}
	
	@GetMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttrbutes) {
		redirectAttrbutes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
	
}
