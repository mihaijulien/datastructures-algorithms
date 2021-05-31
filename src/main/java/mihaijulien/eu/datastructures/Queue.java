package mihaijulien.eu.datastructures;

public class Queue<T> {

    private T[] queue;
    private int count;
    private int rear;
    private int front;

    private static final int MAX_SIZE = 20;

    public Queue(){
        queue = (T[]) new Object[MAX_SIZE];
        rear = -1;
        front = 0;
        count = 0;
    }

    public T enqueue(T element) {
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        queue[rear] = element;
        count++;

        return element;
    }

    public T dequeue(){
        T tmp = queue[front];
        front++;
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        count--;

        return tmp;
    }

    public T peek(){
        return queue[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX_SIZE;
    }

    public int getSize(){
        return count;
    }
}
