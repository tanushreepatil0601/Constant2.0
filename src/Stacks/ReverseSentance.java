package Stacks;

import java.util.Stack;

public class ReverseSentance{
    public static void main(String[] args) {
        String str = "{[()]}";
        boolean flag = true;
        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                sk.push(x);
            } else {
                if (!sk.isEmpty()) {
                    char y = sk.pop();
                    // Correcting the if condition to check for matching pairs
                    if (!(x == ')' && y == '(' || x == ']' && y == '[' || x == '}' && y == '{')) {
                        flag = false;
                        break; // Exit loop on first mismatch
                    }
                } else {
                    flag = false;
                    break; // Exit loop if stack is empty but closing bracket is found
                }
            }
        }

        // Final check for any unmatched opening brackets
        if (!sk.isEmpty()) {
            flag = false;
        }

        if (flag) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}