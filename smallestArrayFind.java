import java.util.Scanner;

public class smallestArrayFind {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++) {
            System.out.print("Enter Number " + i + " : ");
            nums[i] = sc.nextInt();
        }

        int smallest = nums[0];

        for(int i = 0; i < nums.length; i++){
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("----------------------");
        System.out.println("Smallest Number: " + smallest);
        System.out.println("----------------------");

        sc.close();
    }
}
