package com.library.demo.service;

import java.util.List;
import java.util.Optional;

import com.library.demo.model.Book;
import com.library.demo.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    //reading book using id
    public  Optional<Book> getBookById(Long Id){
        return bookRepository.findById(Id);
    }
    public void DeleteBook(Long Id){
        bookRepository.deleteById(Id);
    }
}
