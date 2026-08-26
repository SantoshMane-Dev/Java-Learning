package BankAccountAndTransactionSystem;

public class BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {

        if (accountName == null || accountName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid account name");
        } else {
            this.accountName = accountName.trim();
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid Balance");
        } else {
            this.balance = balance;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid Balance!");
            return;
        }
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Enter Valid Amount.");
            return;
        } else {
            balance += amount;
            System.out.println("\nDeposit Successful.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter Valid Amount.");
            return;
        }
        if (balance < amount) {
            System.out.println("\nInsufficient Balance!");
            return;
        } else {
            balance -= amount;
            System.out.println("\nWithdrawal Successful.");
        }
    }
}