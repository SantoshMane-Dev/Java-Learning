package fundamentalsPractice;

import java.util.Scanner;

public class sumOfDigitFunctn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("-------------------------------");
        System.out.println("Sum Of " + num +" Is : " + sum);


        sc.close();
  
    }

    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}