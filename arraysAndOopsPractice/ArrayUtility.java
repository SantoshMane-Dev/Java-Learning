package arraysAndOopsPractice;
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(Scanner sc) throws Exception {

        System.out.print("Enter Elements of a Number: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        if (size < 2) {

            System.out.println("--------------------------------------------");
            System.out.println("This Wont Work! Enter Atleast Two Elements");
            System.out.println("--------------------------------------------");
            throw new Exception("Error Message");

        }

        int i = 0;

        while(i < size){
            System.out.print("Enter Number For Element No " + (i+1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }
}
