package TernaryAndRecursion;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Palindrome Checker----------------");

        System.out.println("Enter String For Check Palindrome: ");
        String input = sc.nextLine();

        System.out.println("You String Is "+ (isPalindrome(input) ? "Palindrome Number" : "Not Palindrome Number"));

        sc.close();
    }

    public static boolean isPalindrome(String input) {
        if(input.length() <= 1){
            return true;
        }

        int lastpos = input.length() - 1;
        if(input.charAt(0) != input.charAt(lastpos)) {
            return false;
        }

        String str = input.substring(1, lastpos);

        return isPalindrome(str);
    }
}
