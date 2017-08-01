package com.twu.biblioteca;


import java.util.ArrayList;

public class Menu {
//I think menu should not know anything about user, move or book, it's only need to print a memu. And commands should not excute
// in menu class, for example, if there are more and more commands in the future this class will become more and more bigger.
    private BookLibrary bookLibrary;
    private Display display;
    private MovieLibrary movieLibrary;
    private UserLibrary userLibrary;

    public Menu(BookLibrary bookLibrary, Display display, MovieLibrary movieLibrary, UserLibrary userLibrary) {
        this.bookLibrary = bookLibrary;
        this.display = display;
        this.movieLibrary = movieLibrary;
        this.userLibrary = userLibrary;
    }

    public void showMenuList() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t1. List books");
        System.out.println("\t\t2. Checkout book");
        System.out.println("\t\t3. Return book");
        System.out.println("\t\t4. List movie");
        System.out.println("\t\t5. Checkout movie");
        System.out.println("\t\t6. Display user information");
        System.out.println("\t\tInput 'Q' or 'q' to quit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void menu() {
        showMenuList();
        String userInput = display.getUserInput();
        while (!userInput.equals("Q") && !userInput.equals("q")) {

            switch (Integer.parseInt(userInput)) {
                case 1:
                    bookLibrary.displayBooksList();
                    break;
                case 2:
                    bookLibrary.checkoutBook();
                    break;
                case 3:
                    bookLibrary.returnCheckoutBook();
                    break;
                case 4:
                    movieLibrary.displayMovieList();
                    break;
                case 5:
                    movieLibrary.checkoutMovie();
                    break;
                case 6:
                    userLibrary.displayUserInfo();
                    break;
                default:
                    display.displayInvalidMessage();
            }
            showMenuList();
            userInput = display.getUserInput();
        }
        System.out.print("Goodbye~");
    }
}
