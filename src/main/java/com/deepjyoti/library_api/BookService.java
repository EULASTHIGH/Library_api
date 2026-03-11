package com.deepjyoti.library_api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book addBook(Integer authorId, Book book){
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException(authorId));
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    public List<Book> getBooksByAuthor(Integer authorId){
        return bookRepository.findByAuthorId(authorId);
    }

    public Book getBookById(Integer id){
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }
}
