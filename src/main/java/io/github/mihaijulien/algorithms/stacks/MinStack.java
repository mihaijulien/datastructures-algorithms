package io.github.mihaijulien.algorithms.stacks;

import io.github.mihaijulien.datastructures.Stack;

public class MinStack<T extends Comparable<T>> {

    private Stack<T> minStack;
    private Stack<T> dataStack;

    public MinStack() {
        this.minStack = new Stack<>();
        this.dataStack = new Stack<>();
    }

    public void push(T value){
        if(dataStack.isEmpty()){
            dataStack.push(value);
            minStack.push(value);
        } else {
            dataStack.push(value);
            if(minStack.peek().compareTo(value) <= 0){
                minStack.push(value);
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public T getMin(){
        return minStack.peek();
    }
}
