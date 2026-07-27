package ExceptionAndFIleHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter First Digits: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Digits: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.printf("Result Is %d\n", result);

        } catch (InputMismatchException e) {
            System.out.println("\n Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("\n Can Not Divide By Zero");
        } finally {
            System.out.println("Program Ended.");
        }

        sc.close();
    }
}