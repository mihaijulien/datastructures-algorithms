package mihaijulien.eu.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void listIsEmptyTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void pushFrontTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.pushFront(1);
        assertEquals(1, (int) linkedList.getHead());
        assertEquals(1, linkedList.getSize());
    }

    @Test
    public void pushBackTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.pushBack(2);
        assertEquals(2, (int) linkedList.getTail());
    }

    @Test
    public void shouldThrowAnException(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        try{
            linkedList.popFront();
            fail("List is already empty");
        } catch(IllegalStateException e){
            // expected
        }
    }

    @Test
    public void findInListTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.pushFront(10);
        assertTrue(linkedList.contains(10));
    }
}
