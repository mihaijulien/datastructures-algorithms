package io.github.mihaijulien.algorithms.strings;

public class PalindromeChecker {

    private PalindromeChecker(){}

    public static boolean isPalindrome(String str){
        return check(str.toLowerCase());
    }

    private static boolean check(String str){

        char[] array = str.toCharArray();

        int leftIdx = 0;
        int rightIdx = array.length -1;

        while(leftIdx < rightIdx){
            if(array[leftIdx] != array[rightIdx]){
                return false;
            }
            leftIdx++;
            rightIdx--;
        }

        return true;
    }
}
