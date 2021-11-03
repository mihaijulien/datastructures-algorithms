package io.github.mihaijulien.algorithms.sorting;

public class MergeSort {

    private MergeSort() { }

    public static int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIdx = 0;
        int rightIdx = 0;
        int resultIdx = 0;

        while (leftIdx < left.length && rightIdx < right.length) {
            if (left[leftIdx] < right[rightIdx]) {
                result[resultIdx] = left[leftIdx];
                leftIdx++;
                resultIdx++;
            } else {
                result[resultIdx] = right[rightIdx];
                rightIdx++;
                resultIdx++;
            }
        }

        while (leftIdx < left.length) {
            result[resultIdx] = left[leftIdx];
            leftIdx++;
            resultIdx++;
        }
        while (rightIdx < right.length) {
            result[resultIdx] = right[rightIdx];
            rightIdx++;
            resultIdx++;
        }

        return result;
    }
}
