package io.github.mihaijulien.datastructures;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class MinHeapTest {

    MinHeap<Integer> heap = new MinHeap<>();

    @Before
    public void setUp(){

         /*
              1
            /  \
           2    3
          / \   /
         4   5 6

        */

        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
    }

    @Test
    public void deleteNodeFromHeapTest(){
        assertEquals(1, (int) heap.delete());
        assertEquals(5, heap.getSize());
    }

    @Test()
    public void removeAllElementsTest(){
        int stop = heap.getSize();
        for(int i=0; i<stop; i++){
            heap.delete();
        }
        assertTrue(heap.isEmpty());

        try{
            heap.delete();
            fail("Heap is already empty");
        } catch(NoSuchElementException e){
            // expected
        }
    }
}
