package arraysAndOopsPractice.Enheritance;

public class Test {
    public static void main(String[] args) {

        Car swift = new Car("Maruti Suzuki", 180, "petrol");
        swift.start();
        swift.drive();
        System.out.println(swift.brand);
    }
}
