package TernaryAndRecursion;

import ArraysAndOopsPractice.ArrayUtility;

public class findMaxValue {
    public static void main(String[] args) {

        System.out.println("------------Welcome To Find Maximum Number----------");

        int[] nums = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            if (max < num) {
            max = num;
            }
        }
        System.out.printf("Maximum Number Is: %d\n", max);
    }
}
