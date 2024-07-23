package Stacks;
import java.util.Stack;
public class SortElement {

    public static void main(String[] args) {
        Stack<Integer> se = new Stack<Integer>();
        se.push(10);
        se.push(2);
        se.push(0);
        se.push(4);
        se.push(5);
        se.push(6);

        Stack<Integer> temp = new Stack<>();
        while (!se.isEmpty()) {
            int x = se.pop();
            while (!temp.isEmpty() && temp.peek()>x){
                se.push(temp.pop());
            }
            temp.push(x);
        }
        System.out.println(temp);
    }
}
