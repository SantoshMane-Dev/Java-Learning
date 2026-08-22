import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String: ");
        String fullName = sc.nextLine();

        System.out.println("----------------Welcome To Learn Strings--------------");
        System.out.println("Length Of String: " + fullName.length());
        System.out.println("First Letter Of String: " + fullName.charAt(0));
        System.out.println("Last Letter Of String: " + fullName.charAt(fullName.length()-1));
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());

        System.out.println("-----------------Thank You----------------------------");

        sc.close();
    }
}
