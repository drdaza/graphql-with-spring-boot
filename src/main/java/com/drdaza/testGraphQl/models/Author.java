package com.drdaza.testGraphQl.models;

public record Author(Integer id, String firstName, String lasName) {

    public String fullName() {
        return firstName + " " + lasName;
    }
}
