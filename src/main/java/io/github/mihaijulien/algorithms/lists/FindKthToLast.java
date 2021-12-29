package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList;

/*
    Finds the kth to last element of a singly linked list and returns it.
    */
public class FindKthToLast<T> extends LinkedList<T> {

    public T findKToLast(int kth){
        // make sure k is positive
        kth = Math.abs(kth);

        int i = 0;

/*
       The suggested solution here is to use two pointers:

        One pointer will first travel K items into the list
        Once that is done, both the pointers start travelling together, one item at a time
        They keep travelling until the end of linked list is found
        In that situation, the first pointer is at the end of the list, but the second pointer would have only reached till Kth element – this is what you want
*/

        Node<T> firstRunner = head;
        Node<T> secondRunner = head;

        while(i != kth){
            // list is smaller than k
            if(firstRunner == null){
                return null;
            }
            firstRunner = firstRunner.getNext();
            i++;
        }

        while(firstRunner != null){
            firstRunner = firstRunner.getNext();
            secondRunner = secondRunner.getNext();
        }
        return secondRunner.getValue();
    }
}
