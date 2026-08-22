package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " : " + result);
        }
        sc.close();
    }
}
