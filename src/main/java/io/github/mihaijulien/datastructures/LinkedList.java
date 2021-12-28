package io.github.mihaijulien.datastructures;

import io.github.mihaijulien.datastructures.util.ListNode;

import java.util.NoSuchElementException;

/**
 * A linked list is a linear collection of data elements whose order is not given by their physical placement in memory.
 * Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together
 * represent a sequence. In its most basic form, each node contains: data, and a reference (in other words, a link) to
 * the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position
 * in the sequence during iteration.
 *
 * <p>Example:
 *
 * <pre>
 *[12] ←-→ [99] ←-→ [37] ←-→ null
 * </pre>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Linked_list">https://en.wikipedia.org/wiki/Linked_list</a>
 *
 */
public class LinkedList<T> {

    protected ListNode<T> head;
    protected ListNode<T> tail;
    private ListNode<T> currentNode;
    protected int size;

    /**
     * Inserts a new element at the beginning of the list
     *
     * @param value the element to be inserted
     * @return the inserted element
     */
    public T pushFront(T value){
        currentNode = new ListNode<>(value);

        if(isEmpty()){
            head = currentNode;
            tail = currentNode;
            currentNode.setNext(null);
            currentNode.setPrev(null);
        } else {
            head.setPrev(currentNode);
            currentNode.setNext(head);
            currentNode.setPrev(null);
            head = currentNode;
        }
        size++;

        return currentNode.getValue();
    }

    /**
     * Inserts a new element at the end of the list
     *
     * @param value the element to be inserted
     * @return the inserted element
     */
    public T pushBack(T value){
        currentNode = new ListNode<>(value);

        if(isEmpty()){
            head = currentNode;
            tail = currentNode;
            currentNode.setNext(null);
            currentNode.setPrev(null);
        } else {
            tail.setNext(currentNode);
            currentNode.setPrev(tail);
            currentNode.setNext(null);
            tail = currentNode;
        }
        size++;

        return currentNode.getValue();
    }

    /**
     * Removes the element in front of the list.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public void popFront(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else {
            head = head.getNext();
        }

        size--;
    }

    /**
     * Removes the last element of the list.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public void popBack(){
        if(isEmpty()){
            throw new NoSuchElementException();
        } else {
            tail = tail.getNext();
        }

        size--;
    }

    /**
     * Checks if a specific element is present in the list
     *
     * @param value the element to search for in the list
     * @return true if the element is present
     */
    public boolean contains(T value){
        if(isEmpty()){
            return false;
        } else {
            while(head != null){
                if(head.getValue() == value){
                    return true;
                }
                head = head.getNext();
            }
        }

        return false;
    }

    /**
     * Checks if the the list is empty.
     *
     * @return true if the list is empty
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Returns the size of the list.
     *
     * @return list size
     */
    public int getSize(){
        return size;
    }

    /**
     * Returns the first element of the list.
     *
     * @return the first element
     */
    public T getHead(){
        return head.getValue();
    }

    /**
     * Returns the last element of the list.
     *
     * @return the last element
     */
    public T getTail(){
        return tail.getValue();
    }
}
