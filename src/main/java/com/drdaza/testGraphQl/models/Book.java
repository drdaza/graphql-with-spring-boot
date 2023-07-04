package com.drdaza.testGraphQl.models;

public record Book(Integer id, String title, Integer pages, Rating rating, Author autor) {
    
}
