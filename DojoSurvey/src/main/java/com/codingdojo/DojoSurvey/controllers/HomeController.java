package com.codingdojo.DojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller

public class HomeController {
	@GetMapping("/")
	public String index() {
		return "home/index";
	}

	@PostMapping("/register")
	public String register(HttpSession session, @RequestParam(value = "name") String username,
			@RequestParam(value = "location") String userLocation,
			@RequestParam(value = "favorite") String userFav,
			@RequestParam(value = "comment", required= false) String userComment) {
	
	session.setAttribute("name", username);
	session.setAttribute("dojo", userLocation);
	session.setAttribute("language", userFav);
	session.setAttribute("comment", "null");
	if(userComment != "null") {
		session.setAttribute("comment", userComment);
	}
	return "redirect:/result";
	}
	
	@GetMapping("/result")
	public String result(HttpSession session, Model model) {
		String myName = (String) session.getAttribute("name");
		String myDojo = (String) session.getAttribute("dojo");
		String myLang = (String) session.getAttribute("language");
		String myComment = (String) session.getAttribute("comment");
		model.addAttribute("myName", myName);
		model.addAttribute("myDojo", myDojo);
		model.addAttribute("myLang", myLang);
		model.addAttribute("myComment", myComment);
		
		return "home/result";
	}

}
