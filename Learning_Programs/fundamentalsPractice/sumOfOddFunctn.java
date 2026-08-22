package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class sumOfOddFunctn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int sum = sumOfOdd(num);
        System.out.println("Sum Of Till Number: " + sum);


        sc.close();
  
    }

    public static int sumOfOdd(int num) {

        int sum = 0;
        int i = 1; 

        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
