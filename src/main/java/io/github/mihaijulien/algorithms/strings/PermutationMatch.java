package io.github.mihaijulien.algorithms.strings;

public class PermutationMatch {

    private PermutationMatch() {}

    public static boolean isPermutation(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int sum = 0;

        for(int i=0; i<str1.length(); i++){
            sum += (int) str1.charAt(i);
        }

        for(int i=0; i<str2.length(); i++){
            sum -= (int) str2.charAt(i);
        }

        if(sum != 0){
            return false;
        }

        return true;
    }
}
