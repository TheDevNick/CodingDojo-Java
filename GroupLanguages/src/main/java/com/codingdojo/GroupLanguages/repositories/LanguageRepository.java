package com.codingdojo.GroupLanguages.repositories;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.GroupLanguages.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
	
	// this method retrieves all the Languages from the database
	List<Language> findAll(); //findAll is a built in method in the CrudRepository
	
	
}
