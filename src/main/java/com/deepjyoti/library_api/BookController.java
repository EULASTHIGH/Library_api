package com.deepjyoti.library_api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/{authorId}")
    public ResponseEntity<Book> addBook(@PathVariable Integer authorId,
                                        @RequestBody Book book){
        Book saved = bookService.addBook(authorId,book);
        return ResponseEntity.status(201).body(saved);
    }
}