package io.github.mihaijulien.algorithms.strings;

import java.util.Arrays;

public class UniqueCharacters {

    private UniqueCharacters() {}

    public static boolean hasUniqueChars(String str){

        if(str.isEmpty()){
            return false;
        }

        if(str.length() == 1){
            return true;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i=0; i< chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                return false;
            }
        }
        return true;
    }
}
