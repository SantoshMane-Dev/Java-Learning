package Learning_Programs.fundamentalsPractice;
import java.util.Scanner;


public class Mad_Lab_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Mad Lab Game!");
        
        // Additional game logic will go here

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter an Adjective (Description): ");
        String adjective = sc.nextLine();

        System.out.print("Enter a Noun (Animal Or Person): ");
        String noun = sc.nextLine();

        System.out.print("Enter a Adjective (Description): ");
        String adjective2 = sc.nextLine();

        System.out.print("Enter a Verb End With -ing (Action): ");
        String verb = sc.nextLine();

        System.out.print("Enter An Adjective (Description): ");
        String adjective3 = sc.nextLine();

        // Input is taken, now we will print the story

        System.out.println("\nToday I Went to a " + adjective + " zoo.");
        System.out.println("In an Exhibit, I saw a " + noun);
        System.out.println(noun + " Was " + adjective2 + " And " + verb);
        System.out.println("I was " + adjective3);

        sc.close();
    }
}
