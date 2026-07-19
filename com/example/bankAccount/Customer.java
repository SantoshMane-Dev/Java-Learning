package com.example.bankAccount;

public class Customer {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount("2fuck", "Raju Katora");

        sbi.deposit(100);

        System.out.println(sbi.withdraw(200));

        sbi.deposit(-40);

        System.out.println(sbi.withdraw(0));


    }
}
