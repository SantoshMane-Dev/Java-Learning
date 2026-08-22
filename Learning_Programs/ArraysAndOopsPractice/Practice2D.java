package Learning_Programs.ArraysAndOopsPractice;

public class Practice2D {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {3, 4, 5},
            {7, 6, 3}
        };

        print2DArray(arr);
        
    }
    
    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i]+ ", ");
        }
        System.out.print(nums[nums.length - 1]+"]");
    }

    public static void print2DArray(int[][] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            printArray(arr[i]);
            System.out.println(",");
        }
        printArray(arr[arr.length - 1]);
        System.out.println();
    }
}
