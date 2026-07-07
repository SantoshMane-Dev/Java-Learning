
import java.util.Scanner;

public class studentProfile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Your Full Name: ");
        String name = sc.nextLine();

        System.out.println("\n--------------Student Details-----------------");

        System.out.println("Original Name: "+ name);
        System.out.println("Uppercase Name: "+ name.toUpperCase());
        System.out.println("Length: "+ name.length());
        System.out.println("First Letter: " + name.charAt(0));
        System.out.println("Last Letter: " + name.charAt(name.length() - 1));
        System.out.println("Does Name Contain a: "+ name.contains("a")+ "\n");

        int space = name.lastIndexOf(" ");
        System.out.println("--------Access Granted----------");
        System.out.println( "Your Surname Is: "+ name.substring(space, name.length()));
        String surname = name.substring(space + 1);

        System.out.print("\nDo you want to Chage Your surname if yes Then Enter yes: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
        System.out.print("\nEnter New Surname: ");
        String newSurname = sc.next();

        System.out.println("Replaced Surname: "+ name.replace(surname, newSurname));
        }
        else {
            System.out.println("Got Your Decision");
        }

        System.out.println("-----------------------------------------------------");
        sc.close();
    }
}
