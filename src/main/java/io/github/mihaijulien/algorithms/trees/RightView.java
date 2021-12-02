package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;

public class RightView <T extends Comparable<T>> extends BinarySearchTree<T> {

    public static int currentLevel = 0;

    public void rigthView(BinaryNode<T> node, int nextLevel){

        if(node == null){
            return;
        }

        if(currentLevel < nextLevel){
            System.out.print(" " + node.getValue());
            currentLevel = nextLevel;
        }

        rigthView(node.getLeft(), nextLevel + 1);
        rigthView(node.getRight(), nextLevel + 1);
    }
}
