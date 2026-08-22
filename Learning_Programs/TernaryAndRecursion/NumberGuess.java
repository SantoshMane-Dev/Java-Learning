package Learning_Programs.TernaryAndRecursion;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        
        System.out.println("----------Number Guessing Game--------------");

        final int num = 6;
        int guess;

        Scanner sc = new Scanner(System.in);

        do {

        System.out.print("Please Guess Number Between 1 To 10: ");
        guess = sc.nextInt();

        } while(guess != num);

        System.out.println("Hurray! You Guessed Correct");

        sc.close();
    }
}
