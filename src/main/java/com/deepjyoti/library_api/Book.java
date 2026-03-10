package com.deepjyoti.library_api;


import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private Float price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Float getPrice() {
        return price;
    }
    public Author getAuthor() {
        return author;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}
