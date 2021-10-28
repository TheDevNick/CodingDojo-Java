package com.codingdojo.Idea.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Idea.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	 User findByEmail(String email);
	 User findByName (String name);
}
