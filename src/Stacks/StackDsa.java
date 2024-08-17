package Stacks;
import java.util.Stack;

    public class StackDsa {
        public static void main(String[] args) {
            Stack<Integer> st=new Stack<Integer>();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            //pop to delete element
//        System.out.println(st.pop());
//        // to find the last element
//        System.out.println(st.peek());
//        //to check
//        // weather stack is empty or not
//        System.out.println(st.isEmpty());

            while(!st.isEmpty()){
                System.out.print(st.peek()+ " ");
                st.pop();
            }
        }
    }
