package io.github.mihaijulien.datastructures;

public class BinarySearchTree<T extends Comparable<T>> {

    private BinaryNode<T> root;
    private int size;

    public BinarySearchTree() {
        size = 0;
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private BinaryNode<T> insert(BinaryNode<T> node, T value) {
        if (node == null) {
            return new BinaryNode<>(value);
        }

        if (node.getValue().compareTo(value) > 0) {
            node.left = insert(node.left, value);
        } else if (node.getValue().compareTo(value) < 0) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }
        return node;
    }

    public void delete(T value){
        delete(root, value);
    }

    public BinaryNode<T> delete(BinaryNode<T> node, T value){
        if(node == null){
            return node;
        } else if(node.getValue().compareTo(value) > 0){
            node.left = delete(node.left, value);
        } else if(node.getValue().compareTo(value) < 0){
            node.right = delete(node.right, value);
        } else {

            if(node.left == null){
                return node.right;
            } else if( node.right == null){
                return node.left;
            }

            node.setValue(findMin(node.right));
            node.right = delete(node.right, node.getValue());
        }
        return node;
    }

    public T findMin(){
        return findMin(root);
    }

    private T findMin(BinaryNode<T> node){
        T min = node.getValue();

        while(node.left != null){
            min = node.left.getValue();
            node = node.left;
        }

        return min;
    }

    public static class BinaryNode<T extends Comparable<T>> {
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
}
