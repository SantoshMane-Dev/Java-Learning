package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class studResultCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Marks Of subject " + i + " : ");
            marks[i] = sc.nextInt();
        }

        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        double percentage = ((double) total / 500 * 100);

        System.out.println("--------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Total Marks Obtained: " + total);
        System.out.println("Percentage Got: " + percentage);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}
