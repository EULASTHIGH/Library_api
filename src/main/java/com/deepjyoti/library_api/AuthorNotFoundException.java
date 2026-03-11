package com.deepjyoti.library_api;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(Integer id) {
        super("author with id " + id + " not found.");
    }
}
