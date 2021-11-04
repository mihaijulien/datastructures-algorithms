package io.github.mihaijulien.algorithms.lists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveListDuplicatesTest {

        RemoveListDuplicates<String> testList;

        @Before
        public void setUp(){
            testList = new RemoveListDuplicates<>();

            // dummy data
            testList.pushBack("first");
            testList.pushBack("second");
            testList.pushBack("third");
            testList.pushBack("third");
        }

        @Test
        public void removeDuplicatesTest(){
            testList.removeDuplicates();
            assertEquals(3, testList.getSize());
        }
}
