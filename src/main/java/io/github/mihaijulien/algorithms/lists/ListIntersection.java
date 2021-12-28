package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.util.ListNode;

public class ListIntersection<T> {

    /*
    * Using difference of node counts

    Get count of the nodes in the first list, let count be c1.
    Get count of the nodes in the second list, let count be c2.
    Get the difference of counts d = abs(c1 – c2)
    Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes
    Then we can traverse both the lists in parallel till we come across a common node. (Note that getting a common node is done by comparing the address of the nodes)
    *
    * */
    public ListNode<T> getIntersectionNode(ListNode<T> headListA, ListNode<T> headListB){

        if (headListA == null || headListB == null) {
            return null;
        }

        // Traverse both lists to get last node and count
        Result<T> resultA = getLastNodeAndSize(headListA);
        Result<T> resultB = getLastNodeAndSize(headListB);

        // last node of both lists should match if there's an intersection
        if (resultA.node != resultB.node) {
            return null;
        }

        ListNode<T> longer = resultA.size > resultB.size ? headListA : headListB;
        ListNode<T> shorter = resultA.size > resultB.size ? headListB : headListA;

        int difference = Math.abs(resultA.size - resultB.size);

        while (difference > 0) {
            longer = longer.getNext();
            difference--;
        }

        // Now both pointers have the same number of next nodes
        // Move through the lists until intersection is found
        while (longer != shorter) {
            longer = longer.getNext();
            shorter = shorter.getNext();
        }

        return longer;
    }

    private Result<T> getLastNodeAndSize(ListNode<T> start) {
        if (start == null) {
            return new Result<>(null, 0);
        }

        int size = 1;
        ListNode<T> current = start;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }

        return new Result<>(current, size);
    }

    class Result<T> {
        ListNode<T> node;
        int size;

        public Result(ListNode<T> node, int size) {
            this.node = node;
            this.size = size;
        }
    }
}
