package com.codingdojo.Idea.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Idea.models.Idea;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
	Iterable<Idea> findAllByOrderByLikesAsc();
	Iterable<Idea> findAllByOrderByLikesDesc();
}
