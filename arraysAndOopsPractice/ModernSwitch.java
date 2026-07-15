package arraysAndOopsPractice;

import java.util.Scanner;

public class ModernSwitch {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);  

        System.out.print("Enter Day Number: ");
        int day  = sc.nextInt();

        boolean a = switch (day) {
            case 1 -> monPrint();
            case 2 -> tueprint();
            case 3 -> wedprint();
            case 4 -> thuprint();
            case 5 -> friprint();
            case 6 -> satprint();
            case 7 -> sunprint();
            default -> invprint();
        };

        if (a) {
            System.out.println("Successfull");
        } else  {
            System.out.println("Unexpected Error");
        }

        sc.close();
    }

    static boolean monPrint() {
        System.out.println("Monday");
        return true;
    }

    static boolean tueprint() {
        System.out.println("tuesday");
        return true;
    }

    static boolean wedprint() {
        System.out.println("wednesday");
        return true;
    }

    static boolean thuprint() {
        System.out.println("thursday");
        return true;
    }

    static boolean friprint() {
        System.out.println("friday");
        return true;
    }

    static boolean satprint() {
        System.out.println("saturday");
        return true;
    }

    static boolean sunprint() {
        System.out.println("sunday");
        return true;
    }

    static boolean invprint() {
        System.out.println("Invalid");
        return false;
    }


}
