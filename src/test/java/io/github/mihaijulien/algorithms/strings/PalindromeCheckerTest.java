package io.github.mihaijulien.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    @Test
    public void shouldReturnTrue(){
        assertTrue(PalindromeChecker.isPalindrome("abba"));
        assertTrue(PalindromeChecker.isPalindrome("AbBa"));
        assertTrue(PalindromeChecker.isPalindrome("abcba"));
    }

    @Test
    public void shouldReturnFalse(){
        assertFalse(PalindromeChecker.isPalindrome("blabla"));
    }
}
