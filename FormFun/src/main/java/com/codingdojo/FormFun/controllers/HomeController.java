package com.codingdojo.FormFun.controllers;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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

	
	
	
	@PostMapping("/submit")
	public String submit(HttpSession session, @RequestParam(value = "name") String userName,
			@RequestParam(value = "favplayer") String userFavPlayer, 
			@RequestParam(value = "favteam") String userFavTeam,
			@RequestParam(value = "comment", required = false) String userComment) {
		
		session.setAttribute("username", userName);
		session.setAttribute("favplayer", userFavPlayer);
		session.setAttribute("favteam", userFavTeam);
		session.setAttribute("comment", userComment);
		
		return "redirect:/display";
	}
	
	@GetMapping("/display")
	public String display(HttpSession session, Model model) {
		String username = (String) session.getAttribute("username");
		String userFavPlayer = (String) session.getAttribute("favplayer");
		String userFavTeam = (String) session.getAttribute("favteam");
		String userComment = (String) session.getAttribute("comment");
		
		model.addAttribute("myUser", username);
		model.addAttribute("myUserFavPlayer", userFavPlayer);
		model.addAttribute("myUserFavTeam", userFavTeam);
		model.addAttribute("myUserComment", userComment);
		
		return "home/display";
	}
	
}
