package BankAccountAndTransactionSystem;

public class BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double balance) {

        if (accountName == null || accountName.trim().isEmpty()) {
            System.out.println("\nAccount Name Is Invalid");
        } else {
            this.accountName = accountName.trim();
        }
        if (balance < 0) {
            System.out.println("\nInvalid Balance!");
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
        }
        balance += amount;
        System.out.println("\nDeposit Successful.");
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter Valid Amount.");
            return;
        }
        if (balance < amount) {
            System.out.println("\nInsufficient Balance!");
            return;
        }
        balance -= amount;
        System.out.println("\nWithdrawal Successful.");
    }
}