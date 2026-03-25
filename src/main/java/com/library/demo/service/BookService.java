package com.library.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import  com.library.demo.exception.ResourceNotFoundException;
import com.library.demo.model.Book;
import com.library.demo.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    //reading book using id
    public  Book getBookById( Long Id){
        return  bookRepository.findById(Id)
        .orElseThrow(()-> new ResourceNotFoundException("Book not found with id:"+Id));
        
    }
    public void deleteBook( Long Id){
        Book existingBook=bookRepository.findById(Id)
        .orElseThrow(()-> new ResourceNotFoundException("Book not found with id:"+Id));
        bookRepository.delete(existingBook);
    }
    public Book createBook( Book book){
        return bookRepository.save(book);
    }

    public Book updateBook( Long id,  Book book){
        Book existingBook=bookRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Book not found with id:"+id));

        existingBook.setTitle(book.getTitle());
        existingBook.setauthor(book.getauthor());
        existingBook.setGenre(book.getGenre());
        existingBook.setAvailable(book.isAvailable());
        return bookRepository.save(existingBook);
    }
    

}
