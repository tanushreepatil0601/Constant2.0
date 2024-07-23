package ClassOOPS;

public class ClassPen {

    String color;
    String Brand;

//Hello World
    void Write() {
        System.out.println("Write Something");

    }

    public static void main(String[] args) {
        ClassPen p1 = new ClassPen();
        p1.color = "Black";
        p1.Brand = "Jetter";

        p1.Write();
        System.out.println(p1.color);

    }
}
