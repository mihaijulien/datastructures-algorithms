package io.github.mihaijulien.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void queueIsEmptyTest(){
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.getSize() == 0);

        queue.enqueue(1);
        queue.dequeue();
        assertFalse(queue.isFull());
    }

    @Test
    public void enqueueTest(){
        Queue<Integer> queue = new Queue<>();
        assertEquals(1, (int) queue.enqueue(1));
    }

    @Test
    public void queueIsFullTest(){
        Queue<Integer> queue = new Queue<>();
        for(int i=0; i<20; i++){
            queue.enqueue(i);
        }

        assertTrue(queue.isFull());

        try{
            queue.enqueue(21);
            fail("Queue is full");
        } catch(IllegalStateException e){
            // expected
        }
    }
}
