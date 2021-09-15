package com.codingdojo.StudentRoster.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.StudentRoster.models.CourseStudent;
import com.codingdojo.StudentRoster.repositories.CourseStudentRepository;

@Service

public class CourseStudentService {
	@Autowired
	CourseStudentRepository courseStudentRepository;
	

	public CourseStudent createRelationship(CourseStudent courseStudent) {
		return courseStudentRepository.save(courseStudent);
	}	
	
	// delete
	public void deleteRelationship(Long id) {
		courseStudentRepository.deleteById(id);
		return;
	}

}
