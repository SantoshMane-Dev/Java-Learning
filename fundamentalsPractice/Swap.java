package fundamentalsPractice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter First Digit: ");
        int first = sc.nextInt();

        System.out.print("Enter Second Digit: ");
        int second = sc.nextInt();

        int temp; 

       
        temp = first;
        first = second;
        second = temp;


        System.out.println("=============After Swapping===========");

        System.out.println("First Digit: "+ first);
        System.out.println("Second Digit: "+ second);

        sc.close();
        
    }
}
