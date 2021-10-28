package com.codingdojo.Idea.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.Idea.models.Idea;
import com.codingdojo.Idea.models.User;
import com.codingdojo.Idea.services.IdeaService;
import com.codingdojo.Idea.services.UserService;
import com.codingdojo.Idea.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator validator;
	@Autowired
	private IdeaService ideaService;
	
	public Long userSessionId(HttpSession session) {
		if(session.getAttribute("userId") == null)
			return null;
		return (Long)session.getAttribute("userId");
	}
	
	@GetMapping("/")
	public String Index(@ModelAttribute("registration") User user, Model model) {
	
		return "login-register.jsp";
	}
	
	@PostMapping("/")
	public String Register(@Valid @ModelAttribute("registration") User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors())
			return "login-register.jsp";
		
		User newUser = this.userService.registerUser(user);
		session.setAttribute("userId", newUser.getId());
		return "redirect:/ideas";
	}
	
	@PostMapping("/login")
	public String Login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirs) {
		if(this.userService.authenticateUser(email, password)) {
			User user = this.userService.getUserByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/ideas";
		}
		redirs.addFlashAttribute("error", "Invalid Email/Password");
		return "redirect:/";
	}
	
	@RequestMapping("/ideas")
	public String home(HttpSession session, Model model) {
		Long uID = (Long) session.getAttribute("userId");
		User user = this.userService.findById(uID);
		Long userId = this.userSessionId(session);
		if(userId == 0)
			return "redirect:/";
		Iterable<Idea> ideas = ideaService.allIdeasLowest();
		model.addAttribute("ideas", ideas);
		model.addAttribute("user", user);
		model.addAttribute("userId", userId);
		return "index.jsp";

	}
	
	@RequestMapping("/ideas/lowest")
	public String homeL(HttpSession session, Model model) {
		Long uID = (Long) session.getAttribute("userId");
		User user = userService.findById(uID);
		Iterable<Idea> ideas = ideaService.allIdeasLowest();
		model.addAttribute("ideas", ideas);
		model.addAttribute("user", user);
		return "index.jsp";

	}
	@RequestMapping("/ideas/highest")
	public String homeH(HttpSession session, Model model) {
		Long uID = (Long) session.getAttribute("userId");
		User user = userService.findById(uID);
		Iterable<Idea> ideas = ideaService.allIdeasHighest();
		model.addAttribute("ideas", ideas);
		model.addAttribute("user", user);
		return "index.jsp";

	}
	

	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}


}
