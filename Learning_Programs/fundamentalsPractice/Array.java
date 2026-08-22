package Learning_Programs.fundamentalsPractice;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.print("Enter First Number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter Second Number: ");
        nums[1] = sc.nextInt();

        System.out.print("Enter Third Number: ");
        nums[2] = sc.nextInt();

        System.out.print("Enter Forth Number: ");
        nums[3] = sc.nextInt();

        System.out.print("Enter Fifth Number: ");
        nums[4] = sc.nextInt();

        for (int i=0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int arr : nums) {
            System.out.print(arr + " ");
        }

        sc.close();
    }   
}