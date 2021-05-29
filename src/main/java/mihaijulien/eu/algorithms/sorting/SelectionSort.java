package mihaijulien.eu.algorithms.sorting;

/**
 * The algorithm divides the input list into two parts: a sorted sublist of items which is built up from left to right
 * at the front (left) of the list and a sublist of the remaining unsorted items that occupy the rest of the list.
 * Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by
 * finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping)
 * it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element
 * to the right.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Selection_sort">https://en.wikipedia.org/wiki/Selection_sort</a>
 */
public class SelectionSort {

    private SelectionSort() {
    }

    /**
     * @param array the array of values to sort
     * @return the sorted array
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        return array;
    }
}
