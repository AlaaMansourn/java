package com.codingdojo.mvc1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc1.models.Book;
import com.codingdojo.mvc1.repositories.BookRepository;

@Service
public class BookService {
	
	
	
	
	 private final BookRepository bookRepository;
	    
	    public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    // returns all the books
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    
	    
	    //update a book 
	    
	    public Book updateBook(Book b ) {
	    	return bookRepository.save(b);
	    	
	    	
	    	
	    	
	    		
	    }
	    
	    public Void deleteBook(Long id) {
	    	
	    	book b = bookrepository.findById(id);
	    	
	    	 bookRepository.delete(b);
	    }

}
