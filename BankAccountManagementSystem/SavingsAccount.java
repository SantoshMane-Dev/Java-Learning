package BankAccountManagementSystem;

public class SavingsAccount extends BankAccount {

    private final double minimumBalance = 500;

    public SavingsAccount(String accHolderName, String accType, int accNumber, double currentBalance) {
        super(accHolderName, accType, accNumber, currentBalance);
    }

    @Override
    public void withdraw(double withdrawalMoney) {

        double balance = getCurrentBalance();

        double remainingBalance = balance - withdrawalMoney;
        
        if(remainingBalance >= minimumBalance) {
        super.withdraw(withdrawalMoney);
        } else {
            System.out.println("\n---------Withdrawal denied. Minimum balance of ₹500 must be maintained.------------\n");
        }
    }
}
