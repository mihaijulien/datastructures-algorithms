package io.github.mihaijulien.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    @Before
    public void setUp(){

         /*
              52
           /     \
          15      56
         /  \     /  \
        9    11  54   61
       / \
      3   5 */

        bst.insert(52);
        bst.insert(15);
        bst.insert(56);
        bst.insert(15);
        bst.insert(56);
        bst.insert(9);
        bst.insert(16);
        bst.insert(54);
        bst.insert(3);
        bst.insert(10);
        bst.insert(65);
        bst.insert(72);
        bst.insert(61);
    }

    @Test
    public void deleteNodeFromBSTTest(){
        bst.delete(56);
    }

    @Test
    public void checkMinValue(){
        int actual = bst.findMin();
        int expected = 3;
        assertEquals(expected, actual);
    }
}
