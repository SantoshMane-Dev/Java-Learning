package com.example.bankAccount;

class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;

    public BankAccount(String accNumber, String accHolderName) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }

    void deposit(double money){
        if (money <= 0){
            System.out.println("Invalid Deposit!");
        } 
        else {
            balance += money;
        }
    }

    double withdraw(double money){
        if (money <= 0) {
            System.out.println("Invalid Withdrawal!");
        } 
        else if (balance >= money) {
            balance -= money;
        }
        else {
            money = balance;
            balance = 0;
        }

        return money;
    }

}
