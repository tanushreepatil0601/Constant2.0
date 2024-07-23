package Polymorphsim;

 class A {
     private int  a=10;
     void PrintData(){
         System.out.println(a);
     }
}
    class B extends A{
     
    }
    public class AccessModifier{
        public static void main(String[] args) {
            B obj = new B();
            obj.PrintData();

        }
    }