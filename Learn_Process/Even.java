package Learn_Process;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Final Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
