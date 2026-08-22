package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class Pos_Neg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");
        }
        else if (num == 0) {
            System.out.println("Number Is Zero");
        }
        else {
            System.out.println("Negative Number");
        }

        sc.close();
    }
}