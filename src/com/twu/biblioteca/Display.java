package com.twu.biblioteca;

import java.util.Scanner;

public class Display {

    public void printWelcomeMessage() {
        System.out.println("Welcome to BibliotecaApp!");
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayInvalidMessage() {
        System.out.println("Select a valid option!");
    }
}
