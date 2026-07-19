package TernaryAndRecursion;

import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        System.out.println("--------------Welcome We Find Number Is Prime Or Not-----------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Number: ");
        int num = sc.nextInt();

        System.out.println("You Number Is " + (isPrime(num) ? "Prime Number" : "Not Prime Number"));

        sc.close();

    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) { 
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
