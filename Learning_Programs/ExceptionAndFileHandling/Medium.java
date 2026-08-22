package Learning_Programs.ExceptionAndFileHandling;

import java.io.FileNotFoundException;

public class Medium {
    public static void main(String[] args) {

        try {
            display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    class InvalidAgeException extends Exception {

        InvalidAgeException() {
            super("Age Is Invalid!");
        }

    }

    public static void display() throws FileNotFoundException {

        throw new FileNotFoundException("File Not Found!");

    }

}
