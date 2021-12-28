package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList;
import io.github.mihaijulien.datastructures.util.ListNode;

import java.util.HashSet;

public class RemoveListDuplicates<T> extends LinkedList<T> {

    HashSet<Object> alreadySeen = new HashSet<>();

    public void removeDuplicates() {
        ListNode<T> current = head;
        ListNode<T> previous = head;

        while (current != null) {
            if (!alreadySeen.contains(current.getValue())) {
                alreadySeen.add(current.getValue());
            } else {
                previous = current.getNext();
                this.size--;
            }
            previous = current;
            current = current.getNext();
        }
    }
}
