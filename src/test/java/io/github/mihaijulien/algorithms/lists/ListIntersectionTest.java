package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.LinkedList.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListIntersectionTest {

    private ListIntersection<String> list;

    @Before
    public void setUp(){
        list = new ListIntersection<>();
    }

    @Test
    public void testOneListEmpty(){
        Node<String> headA = null;
        Node<String> headB = new Node<>("a");

        assertNull(list.getIntersectionNode(headA, headB));
    }

    @Test
    public void testBothListsEmpty() {
        Node<String> headA = null;
        Node<String> headB = null;

        assertNull(list.getIntersectionNode(headA, headB));
    }

    @Test
    public void testOneElementNoIntersection() {
        Node<String> headA = new Node<>("a");
        Node<String> headB = new Node<>("a");

        assertEquals(list.getIntersectionNode(headA, headB), null);
    }

    @Test
    public void testOneElementWithIntersection() {
        Node<String> headA = new Node<>("a");
        Node<String> headB = headA;

        assertEquals(list.getIntersectionNode(headA, headB), headB);
    }

    @Test
    public void testIntersection() {
        Node<String> headA = new Node<>("a");
        Node<String> headB = new Node<>("a");
        Node<String> nextA = new Node<>("b");
        Node<String> nextB = new Node<>("c");
        Node<String> intersection = new Node<>("c");
        Node<String> last = new Node<>("d");

        headA.setNext(nextA);
        headB.setNext(nextB);
        nextA.setNext(intersection);
        nextB.setNext(intersection);
        intersection.setNext(last);

        assertEquals(list.getIntersectionNode(headA, headB), intersection);
    }
}
