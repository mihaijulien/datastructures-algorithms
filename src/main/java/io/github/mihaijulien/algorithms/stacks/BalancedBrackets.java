package io.github.mihaijulien.algorithms.stacks;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String input){
        Stack<Character> stack  = new Stack<>();
        if(input == null || input.length() == 0){
            return false;
        } else {
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['){
                    stack.push(input.charAt(i));
                } else if(input.charAt(i) == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if(input.charAt(i) == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if(input.charAt(i) == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
