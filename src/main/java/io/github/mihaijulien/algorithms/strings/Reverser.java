package io.github.mihaijulien.algorithms.strings;

public class Reverser {

    private Reverser() {}

    public static String reverse(String str){

        if(PalindromeChecker.isPalindrome(str)){
            return str;
        }

        StringBuilder reversed = new StringBuilder();

        int i = str.length() - 1;
        while(i >= 0){
            reversed.append(str.charAt(i));
            i--;
        }

        return reversed.toString();
    }
}
