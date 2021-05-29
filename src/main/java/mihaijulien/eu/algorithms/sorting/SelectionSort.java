package mihaijulien.eu.algorithms.sorting;

public class SelectionSort {

    private SelectionSort() {
    }

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
