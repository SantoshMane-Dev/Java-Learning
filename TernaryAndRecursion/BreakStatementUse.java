package TernaryAndRecursion;

import java.util.Scanner;

public class BreakStatementUse {
    public static void main(String[] args) {

        System.out.println("--------------Break Statement Use Case--------------------------");

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Your Command: ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }
        }

        System.out.println("-----------Welcome Home--------------");
        sc.close();
    }
}
