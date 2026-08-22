package Learning_Programs.TernaryAndRecursion;

import java.util.Scanner;

import Learning_Programs.ArraysAndOopsPractice.ArrayUtility;

public class OccurrencesForeach {
    public static void main(String[] args) {
        
        System.out.println("-----------Welcome We Find Occurrences-------------");

        Scanner sc = new Scanner(System.in);

        int[] nums = ArrayUtility.inputArray();

        System.out.print("Enter Element You Want To Search: ");
        int element = sc.nextInt();

        int occ = countOccurrences(nums, element);

        System.out.println("---------------------------------------");

        System.out.printf("Your Element Was Found %d Times\n", occ);

        sc.close();
    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for(int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}
