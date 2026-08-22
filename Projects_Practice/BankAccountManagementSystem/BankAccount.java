package BankAccountManagementSystem;

public abstract class BankAccount {

    private String accHolderName;
    private String accType;
    private int accNumber;
    private double currentBalance;

    public BankAccount(String accHolderName, String accType, int accNumber, double currentBalance) {

        // Holder Name
        if (accHolderName == null || accHolderName.trim().isEmpty()) {
            System.out.println("Enter Valid Name!");
        } else {
            this.accHolderName = accHolderName.trim();
        }

        // Account Type
        if (accType == null || accType.trim().isEmpty()) {
            System.out.println("Enter Valid Account Type!");
        } else if (accType.equalsIgnoreCase("Savings") ||
                accType.equalsIgnoreCase("Current")) {
            this.accType = accType.trim();
        } else {
            System.out.println("-------Invalid Account Type!------------\n");
        }

        // Account Number
        if (accNumber <= 0) {
            System.out.println("Enter Valid Account Number!");
        } else {
            this.accNumber = accNumber;
        }

        // Current Balance
        if (currentBalance >= 0) {
            this.currentBalance = currentBalance;
        } else {
            System.out.println("\n----------Invalid Balance!---------------\n");
        }
    }

    public void deposit(double addMoney) {

        if (addMoney <= 0) {
            System.out.println("\n-----------Invalid Money!-------------------\n");
        } else {
            currentBalance += addMoney;
            System.out.printf("\n-------Money Deposited Successfully, Current Balance: %.2f-----", currentBalance);
            System.out.println("\n");
        }
    }

    public void withdraw(double withdrawalMoney) {

        if (withdrawalMoney <= currentBalance && withdrawalMoney > 0) {

            currentBalance -= withdrawalMoney;
            System.out.printf("\n---------Withdrawal successful, Current Balance: %.2f------------", currentBalance);
            System.out.println("\n");

        } else if (withdrawalMoney > currentBalance) {
            System.out.printf("\n-----------------Insufficient Balance!-----------------\n");
        } else {
            System.out.println("\n--------Enter Valid Amount!-------------\n");
        }
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getAccType() {
        return accType;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
