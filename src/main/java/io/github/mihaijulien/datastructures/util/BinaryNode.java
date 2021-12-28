package io.github.mihaijulien.datastructures.util;

public class BinaryNode<T extends Comparable<T>> {
    private T value;
    private BinaryNode<T> right;
    private BinaryNode<T> left;

    public BinaryNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }
}
