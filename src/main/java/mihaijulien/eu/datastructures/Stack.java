package mihaijulien.eu.datastructures;

import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> list;
    private int size;

    public Stack(){
        list = new LinkedList<>();
        size = 0;
    }

    public T push(T value){
        list.add(value);
        size++;

        return value;
    }

    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is already empty");
        } else {
            list.removeFirst();
        }
        size--;
    }

    public T peek(){
        T temp = list.removeFirst();
        list.push(temp);

        return temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
