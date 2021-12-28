package io.github.mihaijulien.algorithms.lists;

import io.github.mihaijulien.datastructures.util.ListNode;
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
        ListNode<String> headA = null;
        ListNode<String> headB = new ListNode<>("a");

        assertNull(list.getIntersectionNode(headA, headB));
    }

    @Test
    public void testBothListsEmpty() {
        ListNode<String> headA = null;
        ListNode<String> headB = null;

        assertNull(list.getIntersectionNode(headA, headB));
    }

    @Test
    public void testOneElementNoIntersection() {
        ListNode<String> headA = new ListNode<>("a");
        ListNode<String> headB = new ListNode<>("a");

        assertEquals(list.getIntersectionNode(headA, headB), null);
    }

    @Test
    public void testOneElementWithIntersection() {
        ListNode<String> headA = new ListNode<>("a");
        ListNode<String> headB = headA;

        assertEquals(list.getIntersectionNode(headA, headB), headB);
    }

    @Test
    public void testIntersection() {
        ListNode<String> headA = new ListNode<>("a");
        ListNode<String> headB = new ListNode<>("a");
        ListNode<String> nextA = new ListNode<>("b");
        ListNode<String> nextB = new ListNode<>("c");
        ListNode<String> intersection = new ListNode<>("c");
        ListNode<String> last = new ListNode<>("d");

        headA.setNext(nextA);
        headB.setNext(nextB);
        nextA.setNext(intersection);
        nextB.setNext(intersection);
        intersection.setNext(last);

        assertEquals(list.getIntersectionNode(headA, headB), intersection);
    }
}
