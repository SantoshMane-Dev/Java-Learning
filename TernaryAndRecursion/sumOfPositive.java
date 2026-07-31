package TernaryAndRecursion;

import java.util.Scanner;

import ArraysAndOopsPractice.ArrayUtility;

public class sumOfPositive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Sum Of All Positive Number Ignore Negative Numbers---------");

         int[] nums = ArrayUtility.inputArray();
         int sum = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }
            sum += num;
        }

        System.out.println("-------------------------------------------------");
        System.out.println("The Sum Of Positive Number Is: "+ sum);

        sc.close();
    }
}
