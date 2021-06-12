package io.github.mihaijulien.datastructures;

/**
 * a double-ended queue (abbreviated to deque, pronounced deck, like "cheque") is an abstract data type that generalizes
 * a queue, for which elements can be added to or removed from either the front (head) or back (tail).
 *
 * @see <a href="https://en.wikipedia.org/wiki/Double-ended_queue">https://en.wikipedia.org/wiki/Double-ended_queue</a>
 */
public class Deque<T> {

    private T[] deque;
    private int front, rear, count;

    private static int MAX_SIZE = 20;

    /**
     * Instantiates a new Deque.
     */
    public Deque(){
        deque = (T[]) new Object[MAX_SIZE];
        count = 0;
        rear = -1;
        front = -1;
    }

    /**
     * Inserts a new element at the front of the deque.
     *
     * @param element the element to be inserted in the deque
     * @return the element inserted
     */
    public T enqueueFront(T element){
        if(isFull()) {
            throw new IllegalStateException("Deque is full");
        }else if(isEmpty()){
            front = rear = 0;
        } else if(front == 0){
            front = count - 1;
        } else {
            front--;
        }

        deque[front] = element;
        count++;

        return element;
    }

    /**
     * Inserts a new element at the rear of the deque.
     *
     * @param element the element to be inserted in the deque
     * @return the element inserted
     */
    public T enqueueRear(T element){
        if(isFull()){
            throw new IllegalStateException("Deque is full");
        } else if(isEmpty()){
            front = rear = 0;
        } else {
            rear++;
        }

        deque[rear] = element;
        count++;

        return element;
    }

    /**
     * Removes the element at the front of the deque
     *
     * @return the removed element
     */
    public T dequeFront(){
        T tmp;
        if(isEmpty()){
            throw new IllegalStateException("Deque is empty");
        } else if(rear == front){
            tmp = deque[front];
            rear = front = -1;
        } else {
            tmp = deque[front];
            front++;
        }

        return tmp;
    }

    /**
     * Removes the element at the rear of the deque
     *
     * @return the removed element
     */
    public T dequeRear(){
        T tmp;
        if(isEmpty()){
            throw new IllegalStateException("Deque is empty");
        } else if(rear == front){
            tmp = deque[rear];
            rear = front = -1;
        } else {
            tmp = deque[rear];
            rear--;
        }

        return tmp;
    }

    /**
     * Returns the element at the front of the queue.
     *
     * @return the element at the front of the queue
     */
    public T peekFront(){
        return deque[front];
    }

    /**
     * Returns the element at the rear of the queue.
     *
     * @return the element at the rear of the queue
     */
    public T peekRear(){
        return deque[rear];
    }

    /**
     * Returns the size of the deque.
     *
     * @return the number of elements in the deque.
     */
    public int getSize(){
        return count;
    }

    /**
     * Checks if the deque is empty.
     *
     * @return true if the deque is empty
     */
    public boolean isEmpty(){
        return count == 0;
    }

    /**
     * Checks if the deque is full.
     *
     * @return true if the deque is full.
     */
    public boolean isFull(){
        return count == MAX_SIZE;
    }
}
