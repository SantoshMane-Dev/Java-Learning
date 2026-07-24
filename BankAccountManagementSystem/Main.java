package BankAccountManagementSystem;

import java.util.Scanner;

public class Main {

        BankAccount first;


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Main main = new Main();

        System.out.println("\n===============================");
        System.out.println("\tBank Management");
        System.out.println("===============================\n");


        while(true) {

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("0. Exit\n");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            
            String space = sc.nextLine();

            if (choice == 0) {
                System.out.println("Thank You, Exiting.........");
                break;
            }

            switch(choice) {
                case 1: {
                    main.createAccount(sc);
                    break;
                }
                case 2: {
                    main.deposit(sc);
                    break;
                }
                case 3: {
                    main.withdraw(sc);
                    break;
                }
                case 4: {
                    main.viewDetail();
                    break;
                }
                default: {
                    System.out.println("Invalid Credentials!");
                    break;
                }
            }

        }
    }

    public void createAccount(Scanner sc){

        System.out.println("\n----------------WELCOME-----------------------");

        System.out.print("Enter Your Full Name  : ");
        String name = sc.nextLine();

        System.out.print("Enter Account Type    : ");
        String type = sc.nextLine();

        System.out.print("Enter Account Number  : ");
        int number = sc.nextInt();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        System.out.println("-----------------------------------------------\n");
        if (type.equalsIgnoreCase("savings")) {
            first = new SavingsAccount(name, type, number, balance);
            System.out.println("------------Savings Account Created Succesfully-------------\n"); 
        } else if (type.equalsIgnoreCase("current")) {
             first = new CurrentAccount(name, type, number, balance);
            System.out.println("------------Current Account Created Succesfully-------------\n"); 
        } else {
        System.out.println("---------------Invalid Account Type!------------\n");
        }
    }


    public void deposit(Scanner sc){
        if (first == null) {
            System.out.println("----------Account Not Found--------------\n");
        } else {
            System.out.print("\nEnter Deposit Amount: ");
            double add = sc.nextDouble();

            first.deposit(add);
        }
    }

    public void withdraw(Scanner sc) {
        if (first == null) {
            System.out.println("----------Account Not Found--------------\n");
        } else {
            System.out.print("\n Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            first.withdraw(withdraw);
        }
    }

    public void viewDetail() {
         if (first == null) {
            System.out.println("----------Account Not Found--------------\n");
        } else {
            ViewDetails view = new ViewDetails();
            view.display(first);
        }
    }
    
}