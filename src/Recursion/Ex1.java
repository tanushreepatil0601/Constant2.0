package Recursion;

public class Ex1 {
//wap to print natural number
    void Natural(int x){
    if (x==101)
    return;

    Natural( x+1);
        System.out.println(x +" ");

    }

    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        obj.Natural(1);
    }

}
