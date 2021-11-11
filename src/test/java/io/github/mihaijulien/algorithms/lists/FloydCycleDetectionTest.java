package io.github.mihaijulien.algorithms.lists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class FloydCycleDetectionTest {

    FloydCycleDetection<Integer> testList;

    @Before
    public void setUp(){
        testList = new FloydCycleDetection<>();

        // dummy data
        testList.pushBack(1);
        testList.pushBack(2);
        testList.pushBack(3);
        testList.pushBack(4);
    }

    @Test
    public void listIsNotALoopTest(){
        assertFalse(testList.hasCycle());
    }
}
