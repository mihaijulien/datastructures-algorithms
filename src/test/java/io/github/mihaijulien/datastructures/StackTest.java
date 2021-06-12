package io.github.mihaijulien.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackTest {

    Stack<Integer> stack = new Stack<>();

    @Before
    public void setUp(){
        for(int i=1; i<11; i++){
            stack.push(i);
        }
    }

    @Test
    public void isEmptyShouldReturnFalseTest(){
        assertFalse(stack.isEmpty());
    }

    @Test
    public void peekTest(){
        assertEquals(1, (int) stack.peek());
    }

    @Test
    public void pushElementAndPeekTest(){
        stack.push(1);
        assertEquals(11, stack.getSize());
    }

    @Test
    public void popElementTest(){
        stack.pop();
        assertEquals(9, stack.getSize());
    }
}
