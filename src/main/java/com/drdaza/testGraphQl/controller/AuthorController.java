package com.drdaza.testGraphQl.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.drdaza.testGraphQl.models.Author;
import com.drdaza.testGraphQl.repositories.AuthorRepository;

@Controller
public class AuthorController {
    
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public List<Author> allAuthors(){
        return authorRepository.findAll();
    }

    @QueryMapping
    public Author findAuthorByName(@Argument String fullName) {
        return authorRepository.findAuthorByName(fullName);
    }
}
