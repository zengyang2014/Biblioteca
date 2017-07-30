package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetail() {
        Movie movie = new Movie("4", "Movie1", "2000", "Movie1's director", 7);
        assertEquals("movie-id:4 movie-name:Movie1 year:2000 director:Movie1's director" + " rating:" + 7, movie.getMovieDetail());
    }
}
