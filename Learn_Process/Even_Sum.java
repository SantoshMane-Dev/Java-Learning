package Learn_Process;

import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Last Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i<= num; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum Of Even Numbers: "+sum);

        sc.close();
    }
}
