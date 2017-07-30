package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        Display display = new Display();
        MovieLibrary movieLibrary = new MovieLibrary();
        UserLibrary userLibrary = new UserLibrary();

        display.printWelcomeMessage();
        Menu menu = new Menu(bookLibrary, display, movieLibrary, userLibrary);
        menu.menu();
    }
}
