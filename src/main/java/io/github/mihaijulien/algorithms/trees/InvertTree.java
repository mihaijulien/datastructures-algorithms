package io.github.mihaijulien.algorithms.trees;

import io.github.mihaijulien.datastructures.BinarySearchTree;

public class InvertTree<T extends Comparable<T>> extends BinarySearchTree<T> {

    public void invert(){
         root = invert(root);
    }

    private BinaryNode<T> invert(BinaryNode<T> node){
        if(node == null){
            return node;
        }

        BinaryNode<T> left = invert(node.getLeft());
        BinaryNode<T> right = invert(node.getRight());

        node.setLeft(right);
        node.setRight(left);

        return node;
    }

}
