package com.example.equals;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("Santosh", "001", 23);
        Person person2 = new Person("Santosh", "001", 23);

        if (person1.equals(person2)) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
