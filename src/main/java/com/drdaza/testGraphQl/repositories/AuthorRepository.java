package com.drdaza.testGraphQl.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.drdaza.testGraphQl.models.Author;

import jakarta.annotation.PostConstruct;

@Repository
public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();
    
    public List<Author> findAll(){
        return authors;
    }

    public Author findById(int id) {
        return authors.stream()
                               .filter(author -> author.id() == id)
                               .findFirst()
                               .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author findAuthorByName(String fullName){
        return authors.stream()
                               .filter(author -> author.fullName().equals(fullName))
                               .findFirst()
                               .orElseThrow(() ->  new  RuntimeException("Author name not found")); 
    }

    @PostConstruct
    private void init() {
        authors.add(new Author(1,"Josh","Long"));
        authors.add(new Author(2,"Mark","Heckler"));
        authors.add(new Author(3,"Greg","Turnquist"));
    }

}
