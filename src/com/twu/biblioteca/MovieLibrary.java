package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public MovieLibrary() {
        movies.add(new Movie("1", "movie1", "2011", "movie1's director", 1));
        movies.add(new Movie("2", "movie2", "2011", "movie2's director", 4));
        movies.add(new Movie("3", "movie3", "2011", "movie3's director", 2));
    }

    public void displayMovieList() {
        for (Movie movie : this.movies) {
            System.out.println(movie.getMovieDetail());
        }
    }

    public void checkoutMovie() {
        System.out.println("Please input the movie-id to check out?");
        displayMovieList();
        Display display = new Display();
        String userInput = display.getUserInput();
        int index = Integer.parseInt(userInput) - 1;
        if (index >= 0 && index < movies.size()) {
            System.out.println("Thank you! Enjoy your movie.");
        } else {
            System.out.println("That movie is not available.");
        }
    }

}
