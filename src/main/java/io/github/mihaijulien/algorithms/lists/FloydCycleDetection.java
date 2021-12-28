package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList;
import io.github.mihaijulien.datastructures.util.ListNode;

public class FloydCycleDetection<T> extends LinkedList<T> {

    public boolean hasCycle(){
        return hasCycle(head);
    }

    public boolean hasCycle(ListNode<T> head){
        if(head == null){
            return false;
        }

        ListNode<T> slow = head;
        ListNode<T> fast = head;

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
