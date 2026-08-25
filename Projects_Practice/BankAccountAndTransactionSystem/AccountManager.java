package BankAccountAndTransactionSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AccountManager {

    List<BankAccount> list = new ArrayList<>();
    int accountCount = 0;

    void addAccount(Scanner sc) {
        System.out.print("Enter Account Name: ");
        String name;
        try {
            name = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Name.");
            return;
        }
        System.out.print("Enter Initial Balance: ");
        double balance;
        try {
            balance = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Balance.");
            return;
        }
        BankAccount account = new BankAccount(name, balance);
        account.setAccountNumber(accountCount + 1);
        list.add(account);
        accountCount++;
        System.out.println("\nAccount Generated Successfully.");
    }

    BankAccount findAccount(Scanner sc) {

        System.out.print("Enter Account Number: ");
        int accountNumber;
        try {
            accountNumber = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Account Number.");
            sc.nextLine();
            return null;
        }
        return findAccountByNumber(accountNumber);
    }

    BankAccount findAccountByNumber(int accountNumber) {

        for (int i = 0; i < list.size(); i++) {
            BankAccount account = list.get(i);
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    void viewDetails(Scanner sc) {

        BankAccount account = findAccount(sc);
        if (account == null) {
            System.out.println("Account Not Found!");
            return;
        }
        System.out.println("\n========== Account Details ==========");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Name   : " + account.getAccountName());
        System.out.println("Balance        : " + account.getBalance());
        System.out.println("=====================================");
    }

    void checkBalance(Scanner sc) {

        BankAccount account = findAccount(sc);
        if (account == null) {
            System.out.println("Account Not Found!");
            return;
        }
        System.out.println("Current Balance: " + account.getBalance());
    }

    void transfer(Scanner sc) {

        System.out.print("Enter Sender Account Number: ");
        int senderNumber;
        try {
            senderNumber = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Account Number.");
            sc.nextLine();
            return;
        }
        BankAccount sender = findAccountByNumber(senderNumber);
        if (sender == null) {
            System.out.println("Sender Account Not Found!");
            return;
        }
        System.out.print("Enter Receiver Account Number: ");
        int receiverNumber;
        try {
            receiverNumber = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Account Number.");
            sc.nextLine();
            return;
        }
        BankAccount receiver = findAccountByNumber(receiverNumber);
        if (receiver == null) {
            System.out.println("Receiver Account Not Found!");
            return;
        }
        if (sender == receiver) {
            System.out.println("Sender And Receiver Cannot Be Same.");
            return;
        }
        System.out.print("Enter Transfer Amount: ");
        double amount;
        try {
            amount = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Amount.");
            sc.nextLine();
            return;
        }
        if (amount <= 0) {
            System.out.println("Enter A Valid Amount.");
            return;
        }
        if (sender.getBalance() < amount) {
            System.out.println("Insufficient Balance!");
            return;
        }
        sender.withdraw(amount);
        receiver.deposit(amount);
        System.out.println("Transfer Successful.");
    }

    void deposit(Scanner sc) {
        BankAccount account = findAccount(sc);
        if (account == null) {
            System.out.println("Account Not Found!");
            return;
        }
        System.out.print("Enter Deposit Amount: ");
        double amount;
        try {
            amount = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Amount.");
            sc.nextLine();
            return;
        }
        account.deposit(amount);
    }

    void withdraw(Scanner sc) {
        BankAccount account = findAccount(sc);
        if (account == null) {
            System.out.println("Account Not Found!");
            return;
        }
        System.out.print("Enter Withdrawal Amount: ");
        double amount;
        try {
            amount = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Enter A Valid Amount.");
            sc.nextLine();
            return;
        }
        account.withdraw(amount);
    }
}