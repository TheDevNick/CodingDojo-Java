package com.codingdojo.HelloHuman.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
//Tells framework you are using a using a web controller
@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model, @RequestParam(value="name", defaultValue="Human") String name) {
		model.addAttribute("name", name);
		return "home/index.html";
	}
	
	
//	@GetMapping("/user/{usr}")
//	public String showUser(@PathVariable("usr") String userName, Model model) {
//		model.addAttribute("Username", userName);//key-value basically and the key gets called in the html
//		return "home/index.html";
//	}

}
