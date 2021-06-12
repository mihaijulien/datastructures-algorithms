package io.github.mihaijulien.algorithms.sorting;

/**
 * Insertion sort iterates, consuming one input element each repetition, and grows a sorted output list. At each iteration,
 * insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and
 * inserts it there. It repeats until no input elements remain.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Insertion_sort">https://en.wikipedia.org/wiki/Insertion_sort</a>
 */
public class InsertionSort {

    private InsertionSort() {
    }

    /**
     * @param array the array of values to sort
     * @return the sorted array
     */
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
