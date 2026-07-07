package fundamentalsPractice;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("\nYour Name is: " + name);
        System.out.println("Your Age is: " + age);

        sc.close();
    }
}   