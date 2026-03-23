package com.library.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.demo.model.Book;
import com.library.demo.service.BookService;

@RestController
@RequestMapping("/api/books")
public class bookController {
    @Autowired
    private BookService bookService;

    //getting all the books
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
     //getting  the book by id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id ){
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id,book);
    }
    @DeleteMapping("/{id}")
    public String DeleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return  ("Book deleted successfully with id:"+id);
    }
}

