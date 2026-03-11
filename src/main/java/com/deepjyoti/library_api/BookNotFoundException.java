package com.deepjyoti.library_api;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Integer id) {
        super("Book with id " + id + " not found.");
    }
}
