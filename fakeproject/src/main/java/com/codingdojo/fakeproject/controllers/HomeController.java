package com.codingdojo.fakeproject.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}