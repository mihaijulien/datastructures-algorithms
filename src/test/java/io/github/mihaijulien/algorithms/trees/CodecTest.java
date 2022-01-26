package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodecTest {

    private Codec<Integer> codec = new Codec<>();
    private BinarySearchTree.BinaryNode<Integer>  root;

    @Before
    public void setUp(){

        root = new BinarySearchTree.BinaryNode<>(1);
        root.setLeft(new BinarySearchTree.BinaryNode<Integer>(2));
        root.setRight(new BinarySearchTree.BinaryNode<Integer>(3));
        root.getLeft().setRight(new BinarySearchTree.BinaryNode<Integer>(4));
        root.getRight().setLeft(new BinarySearchTree.BinaryNode<Integer>(5));
    }

    @Test
    public void serializeBSTtoStringTest(){
       assertEquals("1,2,None,4,None,None,3,5,None,None,None,", codec.serialize(root));
    }
}
