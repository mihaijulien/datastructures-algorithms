package io.github.mihaijulien.algorithms.sorting;

public class HeapSort {

    private HeapSort() {}

    public static int[] sort(int[] array){
        int heapSize = array.length;

        for(int i = heapSize /2 -1; i >=0; i--){
            heapify(array, heapSize, i);
        }

        for(int i= heapSize - 1; i > 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

        return array;
    }

    private static void heapify(int[] array, int heapSize, int i){
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        while(leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        while(rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
}
