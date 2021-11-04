package io.github.mihaijulien.algorithms.lists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindKthToLastTest {

    FindKthToLast<String> testList;

    @Before
    public void setUp(){
        testList = new FindKthToLast<>();

        // dummy data
        testList.pushBack("first");
        testList.pushBack("second");
        testList.pushBack("third");
        testList.pushBack("fourth");
    }

    @Test
    public void listNotLongEnoughTest(){
        String actual = testList.findKToLast(10);
        assertEquals(null, actual);
    }

    @Test
    public void emptyListTest(){
        FindKthToLast<String> emptyList = new FindKthToLast<>();
        assertEquals(emptyList.findKToLast(2), null);
    }

    @Test
    public void findKthToLastTest(){
       String actual = testList.findKToLast(2);
       String expected = "third";
       assertEquals(expected, actual);
    }
}
