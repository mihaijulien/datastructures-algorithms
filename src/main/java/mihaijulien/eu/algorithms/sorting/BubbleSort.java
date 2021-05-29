package mihaijulien.eu.algorithms.sorting;

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the
 * list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated
 * until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger
 * elements "bubble" to the top of the list.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">https://en.wikipedia.org/wiki/Bubble_sort</a>
 */
public class BubbleSort {

    private BubbleSort() {}

    /**
     * @param array the array of values to sort
     * @return the sorted array
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
