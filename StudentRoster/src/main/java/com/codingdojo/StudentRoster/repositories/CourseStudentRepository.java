package com.codingdojo.StudentRoster.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.StudentRoster.models.CourseStudent;

@Repository

public interface CourseStudentRepository extends CrudRepository<CourseStudent, Long> {

	void deleteById(Long id);


}
