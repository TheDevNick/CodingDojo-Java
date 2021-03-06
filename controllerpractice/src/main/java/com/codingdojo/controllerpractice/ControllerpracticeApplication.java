package com.codingdojo.controllerpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Controller
public class ControllerpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerpracticeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		return "You searched for: " + searchQuery;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello page!";
	}
	
	@RequestMapping("/hello/goodbye")
	public String goodbye() {
		return "Goodbye friend!";
	}

}
