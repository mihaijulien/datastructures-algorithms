package io.github.mihaijulien.algorithms.arrays;

public class ArraySorted {

    public static boolean isSorted(int[] array){
        return isSorted(array, 0);
    }

    public static boolean isSorted(int[] array, int i){
        if(i == array.length - 1){
            return true;
        }

        if(array[i] < array[i + 1]){
            return isSorted(array, ++i);
        } else {
            return false;
        }
    }
}
