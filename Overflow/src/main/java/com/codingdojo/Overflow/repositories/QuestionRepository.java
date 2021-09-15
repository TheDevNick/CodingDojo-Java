package com.codingdojo.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Overflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	List<Question> findAll();
}
