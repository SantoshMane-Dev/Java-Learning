import java.util.Scanner;

public class StringsPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.println("\n----------------Task 1-----------------------");
        System.out.println("UserName: " + username.toLowerCase());
        System.out.println("After Trimming: " + username.trim());
        System.out.println("After Replacing: " + username.replace(" ", "_"));
        System.out.println("-----------------------------------------------\n");


        System.out.println("----------------Task 2-----------------------");
        System.out.println("Username: " + email.substring(0, email.indexOf("@")));
        System.out.println("Domain: " + email.substring(email.indexOf("@") + 1));
        System.out.println("-----------------------------------------------\n");

        String id = "KalaDon";
        String passsword = "password"; 

        System.out.print("Enter Id: ");
        String userInputId = sc.nextLine();

        System.out.print("Enter Password: ");
        String userInputpassword = sc.nextLine();

        System.out.println("\n----------------Task 3-----------------------");

        if (id.equals(userInputId) && passsword.equals(userInputpassword)) {
            System.out.println("-------WELCOME--------");
            System.out.println("Login Access Granted.......");
        }
        else {
            System.out.println("Invalid Credentials!");
        }
        System.out.println("-----------------------------------------------\n");

        sc.close();
    }
}
