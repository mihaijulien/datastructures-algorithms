package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList;

import java.util.HashSet;

public class RemoveListDuplicates<T> extends LinkedList<T> {

    HashSet<Object> alreadySeen = new HashSet<>();

    public void removeDuplicates() {
        Node<T> current = head;
        Node<T> previous = head;

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
