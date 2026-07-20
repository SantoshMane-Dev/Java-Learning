package in.oops.abstraction.FlyableThings;

public abstract class Bird implements Flyable {

    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println("Flying............");
    }

    public String getBreed() {
        return breed;
    }
    
}
