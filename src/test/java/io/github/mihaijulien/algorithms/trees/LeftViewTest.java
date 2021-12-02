package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LeftViewTest {

    private LeftView<Integer> bst = new LeftView<>();
    private BinarySearchTree.BinaryNode<Integer>  root;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp(){

        root = new BinarySearchTree.BinaryNode<>(1);
        root.setLeft(new BinarySearchTree.BinaryNode<Integer>(2));
        root.setRight(new BinarySearchTree.BinaryNode<Integer>(3));
        root.getLeft().setRight(new BinarySearchTree.BinaryNode<Integer>(4));
        root.getRight().setLeft(new BinarySearchTree.BinaryNode<Integer>(5));

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void getLeftView(){
        bst.leftView(root);

        assertEquals("2 4", outputStreamCaptor.toString().trim());
    }
}
