package mihaijulien.eu.datastructures;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentNode;
    private int size;

    public T pushFront(T value){
        currentNode = new Node<>(value);

        if(isEmpty()){
            head = currentNode;
            tail = currentNode;
            currentNode.next = null;
        } else {
            head = currentNode;
            currentNode.next = head;
        }
        size++;

        return currentNode.getValue();
    }

    public T pushBack(T value){
        currentNode = new Node<>(value);

        if(isEmpty()){
            head = currentNode;
            tail = currentNode;
            currentNode.next = null;
        } else {
            currentNode.next = tail;
            tail = currentNode;
        }
        size++;

        return currentNode.getValue();
    }

    public void popFront(){
        if(isEmpty()){
            throw new IllegalStateException("List is already empty");
        } else {
            head = head.next;
        }

        size--;
    }

    public void popBack(){
        if(isEmpty()){
            throw new IllegalStateException("List is already empty");
        } else {
            tail = tail.next;
        }

        size--;
    }

    public boolean contains(T value){
        if(isEmpty()){
            return false;
        } else {
            while(head != null){
                if(head.getValue() == value){
                    return true;
                }
                head = head.next;
            }
        }

        return false;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public T getHead(){
        return head.getValue();
    }

    public T getTail(){
        return tail.getValue();
    }

    public static class Node<T>{
        private Node<T> next;
        private T value;

        public Node(T value){
            this.value = value;
        }

        public T getValue(){
            return this.value;
        }
    }
}
