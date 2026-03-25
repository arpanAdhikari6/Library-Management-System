package com.library.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.demo.model.Book;
import com.library.demo.service.BookService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
@Tag(name = "Book API", description = "Operations related to books")
public class BookController {
    @Autowired
    private BookService bookService;

    //getting all the books
    @Operation(summary = "Get all books")
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
     //getting  the book by id
    @GetMapping("/{id}")
    @Operation(summary = "Get books by id")
    public Book getBookById(@PathVariable Long id ){
        return bookService.getBookById(id);
    }

    @PostMapping
    @Operation(summary = "Create data of a new book")
    public Book createBook(@Valid @RequestBody Book book){
        return bookService.saveBook(book);
    }
    @PutMapping("/{id}")
    @Operation(summary = "Update data of an existing book")
    public Book updateBook(@PathVariable Long id, @Valid @RequestBody Book book){
        return bookService.updateBook(id,book);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an existing book")
    public ResponseEntity<String> DeleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return  ResponseEntity.ok("Book deleted successfully with id:"+id);
    }
}

