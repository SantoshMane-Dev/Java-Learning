package arraysAndOopsPractice;

import java.util.Scanner;

public class numOfOcuurences {
    public static void main(String[] args) {
        
        System.out.println("--------- Finding The Number Of Occurances -----------");

        Scanner sc = new Scanner(System.in);

        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Enter the Number You want To Find: ");
        int num = sc.nextInt();

        int occurances = noOfOcuurences(numArray, num);

        System.out.println("Your Element Was Found "+ occurances + " Times");

        sc.close();

    }

    public static int noOfOcuurences(int[] numArray, int num) {

        int occ = 0;
        int i = 0;

        while ( i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
