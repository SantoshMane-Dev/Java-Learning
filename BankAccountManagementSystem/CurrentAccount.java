package BankAccountManagementSystem;

public class CurrentAccount extends BankAccount {

    private final double overdraft = 2000;

    public CurrentAccount(String accHolderName, String accType, int accNumber, double currentBalance) {
        super(accHolderName, accType, accNumber, currentBalance);
    }

    @Override
    public void withdraw(double withdrawalMoney) {

        double balance = getCurrentBalance();

        double remainingBalance = balance - withdrawalMoney;

        if (remainingBalance >= -overdraft) {
            super.withdraw(withdrawalMoney);
        } else {
            System.out.println("\n--------Limit Exceeded!---------\n");
        }
    }

}
