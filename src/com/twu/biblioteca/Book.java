package com.twu.biblioteca;

public class Book {

    private String id;
    private String name;
    private String author;
    private String publishedDate;

    public Book(String id, String name, String author, String publishedDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public String getBookDetail() {
        return "book-id:  " + this.id + "; book-name:  " + this.name + "; author:  " + this.author + "; published-date:  " + this.publishedDate;
    }
}
