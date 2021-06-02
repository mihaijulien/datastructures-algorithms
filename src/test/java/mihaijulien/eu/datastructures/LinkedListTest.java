package mihaijulien.eu.datastructures;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void listIsEmptyTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void pushFrontTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.pushFront(1);
        assertEquals(1, (int) linkedList.getHead());
        assertEquals(1, linkedList.getSize());
    }

    @Test
    public void pushBackTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.pushBack(2);
        assertEquals(2, (int) linkedList.getTail());
    }

    @Test
    public void shouldThrowAnException(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        try{
            linkedList.popFront();
            fail("List is already empty");
        } catch(NoSuchElementException e){
            // expected
        }
    }

    @Test
    public void findInListTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.pushFront(10);
        assertTrue(linkedList.contains(10));
    }
}
