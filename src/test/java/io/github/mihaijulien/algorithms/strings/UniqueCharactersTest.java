package io.github.mihaijulien.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueCharactersTest {

    @Test
    public void checkUniqueCharactersShouldReturnTrue(){
        String actual = "abcdefg";
        String singleChar = "a";
        assertTrue(UniqueCharacters.hasUniqueChars(actual));
        assertTrue(UniqueCharacters.hasUniqueChars(singleChar));
    }

    @Test
    public void emptyStringShouldReturnFalse(){
        assertFalse(UniqueCharacters.hasUniqueChars(""));
    }

    @Test
    public void checkUniqueCharactersShouldReturnFalse(){
        String actual = "aa";
        assertFalse(UniqueCharacters.hasUniqueChars(actual));
    }
}
