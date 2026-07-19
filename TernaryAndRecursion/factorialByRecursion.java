package TernaryAndRecursion;

import java.util.Scanner;

public class factorialByRecursion {
    public static void main(String[] args) {

        System.out.println("-------Factorial By Using Recursion------------");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        long fact = factorial(num);

        System.out.printf("Factorial Of %d: %d\n", num, fact);
        
        sc.close();
    }

    public static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num -1);
    }
}
