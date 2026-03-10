package com.deepjyoti.library_api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @PostMapping
    public ResponseEntity<Author> addAuthor(@RequestBody Author author){
        Author saved = authorService.addAuthor(author);
        return ResponseEntity.status(201).body(saved);
    }
}
