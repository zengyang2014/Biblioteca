package com.twu.biblioteca;

public class Movie {

    private String movieId;
    private String movieName;
    private String year;
    private String director;
    private int rating;

    public Movie(String movieId, String movieName, String year, String director, int rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getMovieDetail() {
        return String.format("movie-id:%s movie-name:%-4s year:%-4s director:%-4s rating:%d", movieId, movieName, year, director, rating);
    }

}
