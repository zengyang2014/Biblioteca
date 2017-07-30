package com.twu.biblioteca;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Book> checkedBooks = new ArrayList<Book>();

    public BookLibrary() {
        this.books.add(new Book("1", "sun", "Jimi", "2010/4/1"));
        this.books.add(new Book("2", "moon", "lucy", "2012/2/4"));
        this.books.add(new Book("3", "star", "Nancy", "2014/1/2"));
    }

    public void displayBooksList() {
        for (Book book : this.books) {
            System.out.println(book.getBookDetail());
        }
    }


    public void checkoutBook() {
        System.out.println("Please input the book-id to check out?");
        displayBooksList();
        Display display = new Display();
        String userInput = display.getUserInput();
        int index = Integer.parseInt(userInput) - 1;
        if (index >= 0 && index < books.size()) {
            Book book = books.remove(index);
            checkedBooks.add(book);
            System.out.println("Thank you! Enjoy your book.");
        } else {
            System.out.println("That book is not available.");
        }
    }

    public void returnCheckoutBook() {
        System.out.println("Which book would you want to return?");
        displayBooksList();
        Display display = new Display();
        String userInput = display.getUserInput();
        int index = Integer.parseInt(userInput) - 1;
        if (index >= 0 && index < checkedBooks.size()) {
            Book book = checkedBooks.remove(index);
            books.add(book);
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
        }
    }
}
