package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class factFunctn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("-------------------------------");
        System.out.println("Factorial Of " + num +" Is : " + fact);


        sc.close();
  
    }

    public static int factorial(int num) {

        int fact = 1;
        int i = 1; 

        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
