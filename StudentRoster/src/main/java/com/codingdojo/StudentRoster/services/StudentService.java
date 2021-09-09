package com.codingdojo.StudentRoster.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.codingdojo.StudentRoster.models.Student;
import com.codingdojo.StudentRoster.repositories.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	//find all

	public List<Student> allStudents() {
		return studentRepository.findAll();
	}
	
	//create 
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//find by id
	public Student findById(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	
	//delete
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}

