package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.util.BinaryNode;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LeftViewTest {

    private LeftView<Integer> bst = new LeftView<>();
    private BinaryNode<Integer> root;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp(){

        root = new BinaryNode<>(1);
        root.setLeft(new BinaryNode<Integer>(2));
        root.setRight(new BinaryNode<Integer>(3));
        root.getLeft().setRight(new BinaryNode<Integer>(4));
        root.getRight().setLeft(new BinaryNode<Integer>(5));

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void getLeftView(){
        bst.leftView(root);

        assertEquals("2 4", outputStreamCaptor.toString().trim());
    }
}
