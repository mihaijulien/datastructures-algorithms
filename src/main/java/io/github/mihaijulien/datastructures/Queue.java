package io.github.mihaijulien.datastructures;

/**
 *  A queue is a collection of entities that are maintained in a sequence and can be modified by the addition of entities
 *  at one end of the sequence and the removal of entities from the other end of the sequence. By convention, the end of
 *  the sequence at which elements are added is called the back, tail, or rear of the queue, and the end at which elements
 *  are removed is called the head or front of the queue, analogously to the words used when people line up to wait
 *  for goods or services.
 *
 *   * <pre>
 *  * ————                 ————————               ————
 *  *  1  → enqueue(2) →   1, 2      → dequeue() →  2
 *  * ————                 ————————               ————
 *  * </pre>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Queue_(abstract_data_type)">https://en.wikipedia.org/wiki/Queue_(abstract_data_type)</a>
 */
public class Queue<T> {

    private T[] queue;
    private int count;
    private int rear;
    private int front;

    private static final int MAX_SIZE = 20;

    /**
     * Instantiates a new Queue.
     */
    public Queue(){
        queue = (T[]) new Object[MAX_SIZE];
        rear = -1;
        front = 0;
        count = 0;
    }

    /**
     * Inserts a new element in the queue.
     *
     * @param element the element to be inserted
     * @return the element inserted
     */
    public T enqueue(T element) {
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        queue[rear] = element;
        count++;

        return element;
    }

    /**
     * Removes an element from the queue.
     *
     * @return the removed element
     */
    public T dequeue(){
        T tmp = queue[front];
        front++;
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        count--;

        return tmp;
    }

    /**
     * Returns the element in the front of the queue.
     *
     * @return the element at the front of the queue
     */
    public T peek(){
        return queue[front];
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty
     */
    public boolean isEmpty(){
        return count == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full
     */
    public boolean isFull() {
        return count == MAX_SIZE;
    }

    /**
     * Returns the size of the queue.
     *
     * @return the number of elements in the queue
     */
    public int getSize(){
        return count;
    }
}
