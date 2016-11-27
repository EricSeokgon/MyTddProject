package com.hadeslee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by hadeslee on 2016-11-28.
 */
public class BookTest {
    @Test
    public void testBook() throws Exception {
        Book abook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        Book otherBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        //assertThat(otherBook, is(abook));
        assertThat(abook.getName(),is(otherBook.getName()));
        assertThat(abook.getAuthor(), is(otherBook.getAuthor()));
        assertThat(abook.getPrice(), is(otherBook.getPrice()));
    }

}