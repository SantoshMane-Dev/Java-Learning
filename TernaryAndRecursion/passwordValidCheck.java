package TernaryAndRecursion;

import java.util.Scanner;

public class passwordValidCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pass;
        
        do {

            System.out.print("Enter Password: ");
            pass = sc.nextLine();

        } while(!isValidPassword(pass));

        System.out.println("Welcome");

        sc.close();
    }

    public static boolean isValidPassword (String pass) {
        return pass.length() > 7;
    }
}
