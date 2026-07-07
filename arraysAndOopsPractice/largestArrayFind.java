package arraysAndOopsPractice;
import java.util.Scanner;

public class largestArrayFind {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter Number " + i + " : ");
            nums[i] = sc.nextInt();
        }

        int largest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("--------------------");
        System.out.println("Largest Number: " + largest);
        System.out.println("--------------------");

        sc.close();
    }
}
