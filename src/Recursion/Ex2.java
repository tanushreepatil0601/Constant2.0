package Recursion;

public class Ex2 {

    //wap to find factorial
   static int Fact(int x){
    if(x==1)
        return 1;
    return x*Fact( x-1 );

    }
    public static void main(String[] args){
    int num= Fact(5);
        System.out.println(num);

    }
}
