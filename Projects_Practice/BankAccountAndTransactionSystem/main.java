package BankAccountAndTransactionSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountManager account = new AccountManager();

        while (true) {
            System.out.println("\n================== Menu ====================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. View Account Details");
            System.out.println("0. Exit");
            System.out.println("------------------ End Menu --------------------");
            System.out.print("Enter choice: ");
            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease Enter Number!");
                return;
            }

            if (choice == 0) {
                System.out.println("\nExiting From Menu...");
                break;
            }
            switch (choice) {
                case 1 -> { account.addAccount(sc); }
                case 2 -> { account.deposit(sc); }
                case 3 -> { account.withdraw(sc); }
                case 4 -> { account.transfer(sc); }
                case 5 -> { account.checkBalance(sc); }
                case 6 -> { account.viewDetails(sc); }
                default -> System.out.println("\nEnter Valid Choice.");
            }
        }
        sc.close();
    }
}
