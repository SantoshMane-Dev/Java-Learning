package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Digits: ");
        long num = sc.nextLong();

        long count = 0 ;

        while (num > 0) {
            num /= 10;
            count++; 
        }
        System.out.println("Total Digits: "+count);

        sc.close();
    }
}
