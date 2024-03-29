package io.github.mihaijulien.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void shouldSortRandomlyUnsortedArrayTest() {
        int[] toSort = new int[] {5, 2, 1, 9, 0, 33, 3, 3, 0};
        int[] expected = new int[] {0, 0, 1, 2, 3, 3, 5, 9, 33};

        Assert.assertArrayEquals(expected, BubbleSort.sort(toSort));
    }

    @Test
    public void shouldSortInverseSortedArrayTest() {
        int[] toSort = new int[] {33, 9, 5, 3, 3, 2, 1, 0, 0};
        int[] expected = new int[] {0, 0, 1, 2, 3, 3, 5, 9, 33};

        Assert.assertArrayEquals(expected, BubbleSort.sort(toSort));
    }

    @Test
    public void shouldSortSortedArrayTest() {
        int[] expected = new int[] {0, 0, 1, 2, 3, 3, 5, 9, 33};

        Assert.assertArrayEquals(expected, BubbleSort.sort(expected));
    }
}
