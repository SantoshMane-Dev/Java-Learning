package Learning_Programs.TernaryAndRecursion;

import java.util.Scanner;

public class usecaseOfTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("------------------------------------");

        minValue(num1, num2);
        evenOdd(num1);

        usecaseOfTernary t1 = new usecaseOfTernary();

        t1.absoluteNumber(num2);
        t1.studentResult(num1);
        
        System.out.println(month(num1));

        sc.close();
    }

    public static void minValue(int num1, int num2) {
        String result = num1 > num2 ? "num2" : "num1"; 
        System.out.println("Minimum Value: " + result);
    };

    public static void evenOdd(int num1) {
        String result = num1 % 2 == 0 ? "Even Number" : "Odd Number";
        System.out.println(result);
    };

    public void absoluteNumber(int num2) {
        int result = num2 >= 0 ? num2 : -num2; 
        System.out.println("Absolute Number: " + result); 
    };

    public void studentResult(int num1) {

        String result = num1 > 80 ? "High" : (num1 > 50 ? "medium" : "low");
        System.out.println("Belongs To This Category: " + result);

    };

    public static String month(int num1) {
        return switch(num1) 
        {
            case 1 -> "january";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Octomber";
            case 11 -> "November";
            case 12-> "December";
            default -> "Invalid Details!";
        };
    }

}
