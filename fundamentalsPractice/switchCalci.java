package fundamentalsPractice;

import java.util.Scanner;

public class switchCalci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter First Number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter Second Number: ");
        float num2 = sc.nextFloat();

        for (int i = 50; i > 0; i--) {

        System.out.println("----------------------------");
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Subtraction");
        System.out.println("Press 3 For Multiplication");
        System.out.println("Press 4 For Division");
        System.out.println("Press 5 For Reminder");
        System.out.println("Press 0 For Exit");
        System.out.println("----------------------------");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 0) {
            System.out.println("Exiting..............");
            break;
        }

        System.out.println("\n======================");


        switch(choice) {
            case 1: {
                float add = num1 + num2;
                System.out.println("Addition: "+ add);
                break;
            }
            case 2: {
                float sub = num1 - num2;
                System.out.println("Subtraction: "+ sub);
                break;
            }
            case 3: {
                float mul = num1 * num2;
                System.out.println("Multiplication: "+ mul);
                break;
            }
            case 4: {
                float div = num1 / num2;
                System.out.println("Division: "+ div);
                break;
            }
            case 5: {
                float rem = num1 % num2;
                System.out.println("Reminder: "+ rem);
                break;
            }
            default: {
                System.out.println("Incorrect Input!");
            }
          }
         System.out.println("======================\n");
        }

       sc.close();
    }
}
