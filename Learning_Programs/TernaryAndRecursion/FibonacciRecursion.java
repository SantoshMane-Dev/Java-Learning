package Learning_Programs.TernaryAndRecursion;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        
        System.out.println("-----------Find Fibonacci By Using Recursion--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++){
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println();


        sc.close();
    }

    public static int Fibonacci(int position) {

        if(position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        return Fibonacci(position - 1) + Fibonacci(position - 2);
    }

}
