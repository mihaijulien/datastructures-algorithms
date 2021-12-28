package io.github.mihaijulien.datastructures;

import io.github.mihaijulien.datastructures.util.BinaryNode;

public class BinarySearchTree<T extends Comparable<T>> {

    protected BinaryNode<T> root;
    private int size;

    public BinarySearchTree() {
        size = 0;
    }

    public void insert(T value) {
        root = insert(root, value);
        size++;
    }

    private BinaryNode<T> insert(BinaryNode<T> node, T value) {
        if (node == null) {
            return new BinaryNode<>(value);
        }

        if (node.getValue().compareTo(value) > 0) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (node.getValue().compareTo(value) < 0) {
            node.setRight(insert(node.getRight(), value));
        } else {
            return node;
        }
        return node;
    }

    public void delete(T value){
        delete(root, value);
        size--;
    }

    public BinaryNode<T> delete(BinaryNode<T> node, T value){
        if(node == null){
            return node;
        } else if(node.getValue().compareTo(value) > 0){
            node.setLeft(delete(node.getLeft(), value));
        } else if(node.getValue().compareTo(value) < 0){
            node.setRight(delete(node.getRight(), value));
        } else {

            if(node.getLeft() == null){
                return node.getRight();
            } else if( node.getRight() == null){
                return node.getLeft();
            }

            node.setValue((T) findMin(node.getRight()));
            node.setRight(delete(node.getRight(), node.getValue()));
        }
        return node;
    }

    public T find(T value){
        return find(root, value);
    }

    private T find(BinaryNode<T> node, T value){
        if(node == null){
            return null;
        }

        if(node.getValue().compareTo(value) < 0){
            return (T) find(node.getRight(), value);
        }else if(node.getValue().compareTo(value) > 0){
            return (T) find(node.getLeft(), value);
        } else {
            return node.getValue();
        }
    }

    public T findMin(){
        return findMin(root);
    }

    private T findMin(BinaryNode<T> node){
        T min = node.getValue();

        while(node.getLeft() != null){
            min = (T) node.getLeft().getValue();
            node = node.getLeft();
        }

        return min;
    }

    public int getTreeHeight(){
        return getTreeHeight(root);
    }

    private int getTreeHeight(BinaryNode<T> node){
        if(node == null){
            return 0;
        }

        int left = getTreeHeight(node.getLeft());
        int right = getTreeHeight(node.getRight());

        return Math.max(left, right) + 1;
    }

    public void clear(){
        root = null;
        size = 0;
    }
}
