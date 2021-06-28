package com.codingdojo.mvc1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc1.models.Book;
import com.codingdojo.mvc1.services.BookService;

@RestController
public class BooksApi {
	
	
	
	 private final BookService bookService;
	    public BooksApi(BookService bookService){
	        this.bookService = bookService;
	    }
	    
	    
	    
	    @RequestMapping("/api/books")
	    public List<Book> index() {
	        return bookService.allBooks();
	    }
	    
	    
	    
	    @RequestMapping(value="/api/books/create", method=RequestMethod.POST)
	    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") int numOfPages) {
	    	System.out.println(title);
	    	System.out.println(title);
	        Book book = new Book();
	        book.setLanguage(lang);
	        book.setTitle(title);
	        book.setDescription(desc);
	        
	        book.setNumberOfPages(numOfPages);
	        
	        return bookService.createBook(book);
	        
	        
	       
	    }
	    
	    @RequestMapping("/api/books/{id}")
	    public Book show(@PathVariable("id") Long id) {
	        Book book = bookService.findBook(id);
	        return book;
	    }
	    
	    @RequestMapping("/api/update-books/{id}")
	    public Book update(@PathVariable("id") Long id,@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") int numOfPages) {
	    	System.out.println(id);
	    	
    	Book book=bookService.findBook(id);
    	
	    	book.setTitle(title);
	    	book.setDescription(desc);
	    	book.setNumberOfPages(numOfPages);
	    	book.setLanguage(lang);
	
    	return bookService.updateBook(book);
	 
	    }
	    
	    RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	    public void destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	    }

}
