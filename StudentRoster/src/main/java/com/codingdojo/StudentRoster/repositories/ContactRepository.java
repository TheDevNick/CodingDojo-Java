package com.codingdojo.StudentRoster.repositories;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.StudentRoster.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	   List<Contact> findAll();

	    void deleteById(Long id);
}
