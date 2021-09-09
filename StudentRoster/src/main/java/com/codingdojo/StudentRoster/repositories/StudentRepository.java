package com.codingdojo.StudentRoster.repositories;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.StudentRoster.models.Student;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long>{
	
	   List<Student> findAll();

	   void deleteById(Long id);
	    

} 


