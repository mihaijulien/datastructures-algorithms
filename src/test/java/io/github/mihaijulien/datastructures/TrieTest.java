package io.github.mihaijulien.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrieTest {
    Trie trie = new Trie();

    @Before
    public void setUp(){
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");
        trie.insert("pick");
        trie.insert("pickle");
    }

    @Test
    public void trieTest(){
        assertTrue(trie.search("cat"));
        assertFalse(trie.search("cats"));
        assertTrue(trie.search("dog"));
        assertFalse(trie.search("pic"));
    }
}
