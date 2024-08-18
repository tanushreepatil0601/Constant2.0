package DSA;

import java.util.Scanner;
import java.util.Stack;


public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < name.length(); i++) {
            st.push(name.charAt(i));
        }

        String reverseName = "";
        while (!st.isEmpty()) {
            reverseName = reverseName + st.pop();
        }
        System.out.println(reverseName);
    }
}
