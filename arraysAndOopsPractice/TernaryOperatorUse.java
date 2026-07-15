package arraysAndOopsPractice;

import java.util.Scanner;

public class TernaryOperatorUse {

    public static void main(String[] args) {
        
        Scanner sc  = new  Scanner(System.in);

        System.out.print("Enter Number: ");
        int num  = sc.nextInt();

        System.out.println(num  >  0  ? "positive" : "negative");

        sc.close();
    }

}