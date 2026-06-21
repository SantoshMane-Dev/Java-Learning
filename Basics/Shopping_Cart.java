import java.util.Scanner;

public class Shopping_Cart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart!");

        System.out.print("What Item Would You Like To Buy: ");
        String item = sc.nextLine();

        System.out.print("Enter the price of the Item: ");
        double price = sc.nextDouble();    

        sc.nextLine(); // Consume the newline character

        System.out.print("Enter The Quantity for " + item + ": ");
        int quantity = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        double totalCost = price * quantity;

        System.out.println("\nYou have added " + quantity + " " + item + "(s) to your cart.");
        System.out.println("The total cost is: $" + totalCost);
        sc.nextLine();

        sc.close();

    }
}
