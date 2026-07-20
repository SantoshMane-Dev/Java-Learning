package in.oops.abstraction.shapepractice;

public class TestShapes {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Square s1 = new Square(10.3);

        c1.calculateArea();
        s1.calculateArea();

        System.out.printf("Area Of Circle is %5.2f\n", c1.calculateArea());
        System.out.printf("Area Of Square is %5.2f\n", s1.calculateArea());
        
    }
}
