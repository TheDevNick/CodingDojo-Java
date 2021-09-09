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

import com.codingdojo.StudentRoster.models.Student;
import com.codingdojo.StudentRoster.services.ContactService;
import com.codingdojo.StudentRoster.services.StudentService;


@SpringBootApplication
@Controller
@RequestMapping("/students")
public class StudentController {
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
	
	//find all
	@GetMapping("/")
	public String index(Model model) {
		List<Student> students = studentService.allStudents();
		model.addAttribute("students", students);
		return "index.jsp";
	}
	
	//show student create page 
	@GetMapping("/new")
	public String newStudent(@ModelAttribute("student") Student student) {
		return "/students/new.jsp";
	}

	//post create

	@PostMapping("/new/process")
	public String create(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/students/new";
		} else {
			studentService.createStudent(student);
			return "redirect:/students";
		}
	}
	
	
}
