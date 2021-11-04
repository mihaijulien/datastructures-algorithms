package io.github.mihaijulien.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverserTest {

    @Test
    public void shouldReturnTheReversedString(){
        String actual = "abcd";
        String expected = "dcba";
        assertEquals(expected, Reverser.reverse(actual));
    }

    @Test
    public void shouldReturnTheSameString(){
        String actual = "abba";
        String expected = "abba";
        assertEquals(expected, Reverser.reverse(actual));
    }
}
