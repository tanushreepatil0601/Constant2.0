package Polymorphsim;

class Student {

    void PrintName() {
        System.out.println("Tansuhree patil");
    }
}
class NewStudent extends Student {
    void PrintName() {
        System.out.println("Tanushree");
    }
}
public class Overriding {
    public static void main(String[] args) {
        NewStudent obj = new NewStudent();
        obj.PrintName();
    }
}
