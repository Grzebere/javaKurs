package javaAdvanced.advanced.zadania.stosIqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Exercises5 {
    public static void main(String[] args) {
        System.out.println(balancePares("(())"));

    }

    public static boolean balancePares(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for ( char c : input.toCharArray() ) {
            if (c == '('){
                stack.push(c);
            } else if (c == ')'&& (stack.isEmpty() || stack.pop() !='(')){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
