package BankAccountManagementSystem;

public class ViewDetails {

    void display(BankAccount account) {

        System.out.println("\n----------------ACCOUNT DETAILS-----------------------");

        System.out.println("Account Holder Name: "+ account.getAccHolderName());
        System.out.println("Account Type       : "+ account.getAccType());
        System.out.println("Account Number     : "+ account.getAccNumber());
        System.out.println("Current Balance    : "+ account.getCurrentBalance());

        System.out.println("-------------------------------------------------------\n");
    }
}
