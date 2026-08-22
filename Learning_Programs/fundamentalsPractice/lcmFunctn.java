package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;

public class lcmFunctn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 =  sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 =  sc.nextInt();

        int lcm = lcm(num1,num2);
        System.out.println("Lcm Of The Numbers is: "+lcm);


        sc.close();
    }
    public static int lcm(int num1, int num2) {
        int i = 1;
        while(i <= num2) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0; // unreachable
    }
}
