package Polymorphsim;

public class

Ex1 {
        int Add(int a, int b){
            return a+b;
        }
        int Add(int a, float b, int c){
            System.out.println(b);
            return a+c;
        }
        int Add(int a, int b, int c, int d){
            return a+b+c+d;
        }
        public static void main(String[] args) {
            Ex1 obj = new  Ex1();
            System.out.println(obj.Add(20,34));
            System.out.println(obj.Add(23,34,56));
            System.out.println(obj.Add(56,78,98,45));
            System.out.println(obj.Add(23,23.3f,56));
        }
    }


