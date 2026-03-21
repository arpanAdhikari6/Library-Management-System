package com.library.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import  com.library.demo.model.Book;
import com.library.demo.repository.BookRepository;
import org.springframework.stereotype.Service;
import  org.springframework.web.bind.annotation.*;

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
    public  Optional<Book> getBookById(@PathVariable Long Id){
        return bookRepository.findById(Id);
    }
    public void DeleteBook(@PathVariable Long Id){
        bookRepository.deleteById(Id);
    }
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        Book existingBook=bookRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("Book not found with id:"+id));

        existingBook.setTitle(book.getTitle());
        existingBook.setauthor(book.getauthor());
        existingBook.setGenre(book.getGenre());
        existingBook.setAvailable(book.getAvailable());
        return bookRepository.save(existingBook);
    }
    

}
