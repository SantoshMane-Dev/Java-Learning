package Learning_Programs.ArraysAndOopsPractice;

public class DsaPractice {
    public static void main(String[] args) {
    int target = 1;
    int sum = 0;

    int[] nums = {0, 1, 2, 3, 4, 5};

    for (int i = 0; i < nums.length - 1; i++) {
        sum = nums[i] + nums[i+1];
        if (sum == target) {
            System.out.printf("Target Found at %d and %d\n", nums[i] , nums[i+1]);
            break;
        }

    }
    System.out.println(nums.length);  
    }
}