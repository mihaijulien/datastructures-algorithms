package mihaijulien.eu.algorithms.sorting;

/**
 *  Quicksort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning
 *  the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
 *  For this reason, it is sometimes called partition-exchange sort.[4] The sub-arrays are then sorted recursively. This
 *  can be done in-place, requiring small additional amounts of memory to perform the sorting.
 *
 *  <a href="https://en.wikipedia.org/wiki/Quicksort">https://en.wikipedia.org/wiki/Quicksort</a>
 */
public class QuickSort {

    private QuickSort(){};

    /**
     * @param array the array of values to sort
     * @param start the starting index of the array
     * @param end   the ending index of the array
     * @return the sorted array
     */
    public static int[] sort(int[] array, int start, int end){
        if (start < end) {
            int pivot = partition(array, start, end);
            sort(array, start, pivot - 1);
            sort(array, pivot + 1, end);
        }

        return array;
    }

    /**
     * Method that partitions the array into two sub-arrays. All elements at the left of the pivot are smaller than the
     * pivot and all the elements at the right of the pivot are greater than the pivot
     *
     * @param array the array to partition
     * @param start the starting index of the partition
     * @param end   the ending index of the partition
     * @return the partitioned elements
     */
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int j = start-1;

        for(int i=start; i<end; i++){
            if(array[i] < pivot){
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[j+1];
        array[j+1] = array[end];
        array[end] = temp;

        return j+1;
    }
}
