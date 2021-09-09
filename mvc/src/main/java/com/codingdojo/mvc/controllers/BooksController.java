 package com.codingdojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
 
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
 
	@GetMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
    @PostMapping("/books")
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
    	Book book = bookService.findBook(id);
    	model.addAttribute("book", book);
    	return "/books/showBook.jsp";
    }
    
    @RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        if (book != null){
            model.addAttribute("book", book);
            return "/books/editBook.jsp";
        }else{
            return "redirect:/books";
        }
    }
    
    @PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
            bookService.updateBook(id, book.getTitle(), book.getDescription(), book.getLanguage(), book.getNumberOfPages());
            return "redirect:/books";
        }
    }
    
    @GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable Long id) {
		
		Book book = this.bookService.findBook(id);
		
		if ( book != null ) {
			this.bookService.deleteBook(id);
		}
		
		return "redirect:/books";
	}
    
    
    
}