package com.codingdojo.StudentRoster.controllers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.StudentRoster.models.Contact;
import com.codingdojo.StudentRoster.models.Student;
import com.codingdojo.StudentRoster.services.ContactService;
import com.codingdojo.StudentRoster.services.StudentService;

@SpringBootApplication
@Controller
@RequestMapping("/contacts")
public class ContactController {
//	private final StudentService studentService;
//	public StudentController(StudentService studentService) {
//		this.studentService = studentService;
//	}
//	
//	private final ContactService contactService;
//	public StudentController(ContactService contactService) {
//		this.contactService = contactService;
//	}

	@Autowired
	StudentService studentService;

	@Autowired
	ContactService contactService;

	// create
	@GetMapping("/new")
	public String index(Model model, @ModelAttribute("contact") Contact contact) {
		List<Student> students = studentService.allStudents();
		model.addAttribute("students", students);
		return "/contacts/new.jsp";
	}

	// post create

	@PostMapping("/new/process")
	public String create(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
		if (result.hasErrors()) {
			return "/contacts/new";
		} else {
			contactService.createContact(contact);
			return "redirect:/students";
		}
	}
}
