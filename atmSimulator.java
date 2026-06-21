import java.util.Scanner;

public class atmSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int balance = 10000;

        while(true) {
            System.out.println("----------------------------");
            System.out.println("Press 1 For Check Balance");
            System.out.println("Press 2 For Add Funds");
            System.out.println("Press 3 For Withdraw Funds");
            System.out.println("Press 0 For Exit");
            System.out.println("----------------------------");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("===========================");
                System.out.println("Exiting...........");
                break;
            }

            switch(choice){
                case 1: {           
                    System.out.println("===========================");
                    System.out.println("Available Funds: " + balance);
                    break;
                }
                case 2: {
                    System.out.print("Add Amount: ");
                    int deposit = sc.nextInt();
                    balance += deposit;         
                    System.out.println("===========================");
                    System.out.println("Available Funds: " + balance);
                    break;
                }
                case 3: {
                    System.out.print("Withdraw Amount: ");
                    int withdraw = sc.nextInt();
                    System.out.println("===========================");

                    if (balance >= withdraw) {
                    balance -= withdraw;          
                    System.out.println("Available Funds: " + balance);
                        break;
                    }

                    else {
                        System.out.println("Insufficient Funds!");
                        break;
                    }
                }
                default : {
                    System.out.println("Invalid Input!");
                    break;
                }
            }
            System.out.println("===========================\n");
        }
        sc.close();
    }
}
