package com.library.demo.model;

import  jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="books")
public  class Book{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Title is required")
    private String title;
    @NotBlank(message = "Author is required")
    private  String author;
    @NotBlank(message = "Genre is required")
    private String genre;
    private boolean  available=true;
    @Min(value = 1000, message = "Year must be valid")
    @Max(value = 9999, message = "Year must be valid")
    private int publishedYear;

    public Book(){}
    public Book(String title, String author, String genre){
        this.title=title;
        this.author=author;
        this.genre=genre; 
        this.available=true;
    }
    //Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String Title){
        this.title=Title;
    }

    public String getauthor() {
        return author;
    }
    public void setauthor(String Author){
        this.author=Author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String Genre){
        this.genre=Genre;
    }

    public boolean isAvailable() { 
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}