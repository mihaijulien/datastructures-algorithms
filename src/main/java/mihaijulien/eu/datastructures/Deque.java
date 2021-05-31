package mihaijulien.eu.datastructures;

public class Deque<T> {

    private T[] deque;
    private int front, rear, count;

    private static int MAX_SIZE = 20;

    public Deque(){
        deque = (T[]) new Object[MAX_SIZE];
        count = 0;
        rear = -1;
        front = -1;
    }

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

    public T peekFront(){
        return deque[front];
    }

    public T peekRear(){
        return deque[rear];
    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == MAX_SIZE;
    }
}
