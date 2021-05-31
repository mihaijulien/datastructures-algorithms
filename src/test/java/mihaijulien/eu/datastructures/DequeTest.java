package mihaijulien.eu.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class DequeTest {

    @Test
    public void queueIsEmptyTest(){
        Deque<Integer> deque = new Deque<>();
        assertTrue(deque.getSize() == 0);

        deque.enqueueFront(1);
        deque.dequeFront();
        assertFalse(deque.isFull());
    }

    @Test
    public void enqueueFrontTest(){
        Deque<Integer> deque = new Deque<>();
        assertEquals(1, (int) deque.enqueueFront(1));
    }

    @Test
    public void enqueueRearTest(){
        Deque<Integer> deque = new Deque<>();
        assertEquals(1, (int) deque.enqueueRear(1));
    }

    @Test
    public void queueIsFullTest(){
        Deque<Integer> deque = new Deque<>();
        for(int i=0; i<20; i++){
            deque.enqueueFront(i);
        }

        assertTrue(deque.isFull());

        try{
            deque.enqueueFront(21);
            fail("Queue is full");
        } catch(IllegalStateException e){
            // expected
        }
    }
}
