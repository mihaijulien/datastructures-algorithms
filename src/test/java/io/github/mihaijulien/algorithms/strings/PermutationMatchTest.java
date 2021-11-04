package io.github.mihaijulien.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationMatchTest {

    @Test
    public void stringsArePermutationsOfEachOther(){
        String str1 = "abc";
        String str2 = "cab";
        assertTrue(PermutationMatch.isPermutation(str1, str2));
    }

    @Test
    public void differentLengtsShouldReturnFalse(){
        String str1 = "abc";
        String str2 = "abcd";
        assertFalse(PermutationMatch.isPermutation(str1, str2));
    }

    @Test
    public void noPermutationsShouldReturnFalse(){
        String str1 = "abc";
        String str2 = "xyz";
        assertFalse(PermutationMatch.isPermutation(str1, str2));
    }
}
