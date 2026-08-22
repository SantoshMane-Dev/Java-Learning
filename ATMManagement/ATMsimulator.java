

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMsimulator {

    static double balance = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=========== ATM ===============");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("===============================\n");

            System.out.print("Choose an Option: ");
            try {
                int choice = sc.nextInt();

                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException("\nInvalid menu option. Please choose between 1 and 4.");
                }
                if (choice == 4) {
                    System.out.println("Thank you for using our ATM.");
                    break;
                }

                switch (choice) {
                    case 1 -> checkBalance();
                    case 2 -> deposit(sc);
                    case 3 -> {
                        try {
                            withdraw(sc);
                        } catch (InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please Enter A number.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static void checkBalance() {
        System.out.printf("---------------- Current Balance: %.2f ----------------\n ", balance);
    }

    public static void deposit(Scanner sc) {

        System.out.print("Enter Deposit Amount: ");

        try {
            double add = sc.nextDouble();
            if (add > 0) {
                balance += add;
                System.out.println("\n-------------- Amount Added Successfully ------------------");
                checkBalance();
            } else {
                throw new IllegalArgumentException("\nInvalid Amount. Please Enter Valid Amount");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n Invalid Input Amount!");
            sc.nextLine();
        }
    }

    public static void withdraw(Scanner sc) throws InsufficientBalanceException {

        System.out.print("Enter Withdrawal Amount: ");

        try {
            double withdraw = sc.nextDouble();
            if (withdraw < 1) {
                throw new IllegalArgumentException("\nInvalid Amount. Please Enter Valid Amount");
            }
            if (balance < withdraw) {
                throw new InsufficientBalanceException("\nThere isn't enough money in the account.");
            }
            balance -= withdraw;
            System.out.println("\n--------------- Withdrawal Successful, Take Your Money -------------------");
            checkBalance();
        } catch (InputMismatchException e) {
            System.out.println("\n Invalid Input Amount!");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }
}
