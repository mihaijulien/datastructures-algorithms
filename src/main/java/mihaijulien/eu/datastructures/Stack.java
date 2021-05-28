package mihaijulien.eu.datastructures;

import java.util.LinkedList;

/**
 * A stack is an abstract data type that serves as a collection of elements, with two main principal operations:
 * <ul>
 *     <li>Push, which adds an element to the collection, and</li>
 *     <li>Pop, which removes the most recently added element that was not yet removed.</li>
 * </ul>
 *
 * <pre>
 *  * |1| → push(2) → |2| → pop() → |1|
 *  * |—|             |1|           |—|
 *  *                 |—|
 *  * </pre>
 *
 * <a href="https://en.wikipedia.org/wiki/Stack_%28abstract_data_type%29">https://en.wikipedia.org/wiki/Stack_%28abstract_data_type%29</a>
 *
 * @param <T> the type parameter
 */
public class Stack<T> {

    private LinkedList<T> list;
    private int size;

    /**
     * Instantiates a new Stack.
     */
    public Stack(){
        list = new LinkedList<>();
        size = 0;
    }

    /**
     * Adds new element on top of the stack.
     *
     * @param value the element to be inserted
     * @return the inserted element
     */
    public T push(T value){
        list.add(value);
        size++;

        return value;
    }

    /**
     * Removes the first element added to the stack.
     *
     * @throws IllegalStateException if the stack is empty
     */
    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is already empty");
        } else {
            list.removeFirst();
        }
        size--;
    }

    /**
     * Returns the element in peek of the stack.
     *
     * @return the peek element.
     */
    public T peek(){
        T temp = list.removeFirst();
        list.push(temp);

        return temp;
    }

    /**
     * Checks if the the stack is empty.
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Returns the number of elements within the stack.
     *
     * @return the size of the list
     */
    public int getSize(){
        return size;
    }
}
