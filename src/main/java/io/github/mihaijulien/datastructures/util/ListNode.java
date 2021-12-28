package io.github.mihaijulien.datastructures.util;

public class ListNode <T>{
    private ListNode<T> next;
    private ListNode<T> prev;
    private T value;

    public ListNode(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public ListNode<T> getNext(){
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<T> prev) {
        this.prev = prev;
    }
}
