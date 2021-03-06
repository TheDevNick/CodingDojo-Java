package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class HomeController {

		@GetMapping("/")
		public String Home(HttpSession session) {
	        if(session.getAttribute("count") == null) {
	            // no key found!  set session "count" to 0
	            session.setAttribute("count", 0);
	        }
			return "home/index";
		}
		
		@GetMapping("/counter")
		public String Counter(HttpSession session, Model model ) {
			Integer currentCount = (Integer) session.getAttribute("count");
	        currentCount++;
	        // set the updated count value back into session
	        session.setAttribute("count", currentCount);
	        model.addAttribute("count", currentCount);
			return "home/counter";
		}
}
