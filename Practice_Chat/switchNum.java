package Practice_Chat;

import java.util.Scanner;

public class switchNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number; ");
        int num = sc.nextInt();

        for (int i = 10; i > 0; i--) {

            System.out.println("-----------------------------");
            System.out.println("Press 1 For Check Even/Odd");
            System.out.println("Press 2 For Check Positive/Negative");
            System.out.println("Press 3 For Check Divisible by 5/Not");
            System.out.println("Press 0 For exit");
            System.out.println("-----------------------------");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            System.out.println("================");

            if (choice == 0) {
                System.out.println("Exiting............");
                break;
            }

            switch(choice) {
                case 1: {
                    if (num % 2 == 0) {
                        System.out.println("Even Number");
                    }
                    else {
                        System.out.println("Odd Number");
                    }
                    break;
                }
                case 2: {
                    if (num >= 0 ) {
                        System.out.println("Positive Number");
                    }
                    else {
                        System.out.println("Negative Number");
                    }
                    break;
                }
                case 3: {
                    if (num % 5 == 0) {
                        System.out.println("Divisible By 5");
                    }
                    else {
                        System.out.println("Not Divisible");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid Input!");
                    break;
                }
            }
            System.out.println("================");
        } 

        sc.close();
    }
}
