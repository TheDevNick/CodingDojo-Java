package com.codingdojo.DisplayDate.controllers;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class HomeController {
	@GetMapping("/")
	public String Home() {
		return "home/index.html";
	}
	
	@GetMapping("/date")
	public String Date(Model model, String date) {
		model.addAttribute("date", new java.util.Date());
		return "home/date.html";
	}
	
	@GetMapping("/time")
	public String Time(Model model, String time) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		model.addAttribute("time", java.time.LocalTime.now().format(dtf));
		return "home/time.html";
	}

}
