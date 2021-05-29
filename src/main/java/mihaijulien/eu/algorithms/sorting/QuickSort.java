package mihaijulien.eu.algorithms.sorting;

public class QuickSort {

    private QuickSort(){};

    public static int[] sort(int[] array, int start, int end){
        if (start < end) {
            int pivot = partition(array, start, end);
            sort(array, start, pivot - 1);
            sort(array, pivot + 1, end);
        }

        return array;
    }

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
