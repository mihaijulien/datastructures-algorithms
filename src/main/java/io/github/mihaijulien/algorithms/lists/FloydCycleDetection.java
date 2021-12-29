package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList;

public class FloydCycleDetection<T> extends LinkedList<T> {

    public boolean hasCycle(){
        return hasCycle(head);
    }

    public boolean hasCycle(Node<T> head){
        if(head == null){
            return false;
        }

        Node<T> slow = head;
        Node<T> fast = head;

        // the fast pointer moving twice as fast will catch the slow pointer
        // if there's a loop
        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(fast == slow){
                return true;
            }
        }

        return false;
    }
}
