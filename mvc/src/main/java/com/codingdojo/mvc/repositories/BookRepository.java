package com.codingdojo.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.mvc.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> { //<Table, ID>
	
    // this method retrieves all the books from the database
    List<Book> findAll(); //findAll is a built in method in the CrudRepository
    // this method find a book by their description
    List<Book> findByDescriptionContaining(String search);//???
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
