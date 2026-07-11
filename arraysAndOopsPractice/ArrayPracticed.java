package arraysAndOopsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = ArrayUtility.inputArray();

        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("1. To Find Array Sum");
            System.out.println("2. To Find Array Average");
            System.out.println("3. To Find Array Largest Element");
            System.out.println("4. To Find Array Smallest Element");
            System.out.println("5. To Find Array Reverse");
            System.out.println("6. To Find Number In Array");
            System.out.println("7. To Find Array Occurrences");
            System.out.println("8. To Print Array");
            System.out.println("9. To Learn Simple Sorting");
            System.out.println("0. For Exiting");
            System.out.println("---------------------------------\n");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 0){
            System.out.println("Exiting.............");
            break;
        }

        switch(choice){
            case 1: {
                int sumresult = arraySum(nums);
                System.out.println("\n||| Sum Of Array: "+ sumresult + "|||" );
                break;
            }
            case 2: {
                float averageResult = arrayAverage(nums);
                System.out.println("\n||| Average Of Array: "+ averageResult + "|||" );
                break;
            }
            case 3: { 
                int largestElement = largestElement(nums);
                System.out.println("\n||| Largest Element Of Array: "+ largestElement + "  |||" );
                break;
            }
            case 4: { 
                int smallestElement = smallestElement(nums);
                System.out.println("\n||| Smallest Element Of Array: "+ smallestElement + "  |||" );
                break;
            }
            case 5: {
                reverse(nums);
                break;
            }
            case 6: {
                System.out.print("Enter Number That You Want To Find: ");
                int num = sc.nextInt();
                numberFind(nums, num);
                break;
            }
            case 7: {
                System.out.print("Enter Number That You Want To Find: ");
                int num = sc.nextInt();
                countOcc(nums, num);
                break;
            }
            case 8: {
                printArray(nums);
                break;
            }
            case 9: {
                simpleSort(nums);
                break;
            }
            default: {
                System.out.println("Invalid Input! Try Again");
                break;
            }
        }
    }

        sc.close();
    }

    public static int arraySum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum +=nums[i];
        }
        return sum;
    }

    public static float arrayAverage(int[] nums){
        int sum = arraySum(nums);
        float avg = (float)sum / nums.length;
        return avg;
    }

    public static int largestElement(int[] nums){

        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
                }
            }
            return largest;
        }

    public static int smallestElement(int[] nums){
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
                }
            }
            return smallest;
        }

    public static void reverse(int[] nums) {

            System.out.println("Array Reverse Print Loading.......");
            for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("Element " + i + ": "+ nums[i]);
            }
            System.out.println("\n");
        }

    public static void numberFind(int[] nums, int num) {
        boolean isFound = false;
        int i = 0;

        while(i < nums.length) {
            if (nums[i] == num) {
                isFound = true;
                System.out.println("\nWe Found Your Number At: Index "+ i);
                break;
            }
            i++;
        }
        if (!isFound) {
            System.out.println("\nNot Found! Try Again.");
        }
    } 

    public static void countOcc(int[] nums, int num) {
        int count = 0;
        int i = 0;

        System.out.println("--------------------------------");
        while(i < nums.length) {
            if (nums[i] == num) {
                System.out.println("We Found Your Number At Index: "+ i);
                count++;
            }
            i++;
        }
        System.out.println("No Of Occurrences: "+ count);

        if (count == 0) {
            System.out.println("No Occurreneces!");
            System.out.println("--------------------------------\n");
        }
    } 

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i]+ ", ");
        }
        System.out.println(nums[nums.length - 1]+"]");
    }

    public static void simpleSort(int[] nums) {
        int [] copy = Arrays.copyOf(nums, nums.length);
        int total = 0;
        
        for (int j = 0; j < copy.length - 1; j++) {

            for (int i = 0; i < copy.length - (j + 1); i++) {
                int elm1 = copy[i];
                int elm2 = copy[i+1];

                if (elm1 > elm2){
                    copy[i] = elm2;
                    copy[i+1] = elm1;
                }  
                total++;
            }
        }  
        System.out.println(total);
        printArray(copy);
    }
}