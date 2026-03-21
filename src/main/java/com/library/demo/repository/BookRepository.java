package com.library.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Book;

@Repository
public interface  BookRepository extends JpaRepository<Book,Long>{
    //Add custom queries as per the requirement
    
}