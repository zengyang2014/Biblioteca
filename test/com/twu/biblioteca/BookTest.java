package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldReturnBookDetail() throws Exception {
        Book book = new Book("1", "river", "lily", "2017/1/7");
        assertEquals("book-id:  1; book-name:  river; author:  lily; published-date:  2017/1/7", book.getBookDetail());
    }

}
