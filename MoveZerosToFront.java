import java.util.Arrays;

public class MoveZerosToFront {
    public static void moveZeroesToFront(int[] nums) {
        int left = nums.length - 1; // Position to place non-zero elements

        for (int right = nums.length - 1; right >= 0; right--) {
            if (nums[right] != 0) {
                // Swap non-zero element with left pointer
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left--; // Move left pointer backward
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0,1,0,1};
        moveZeroesToFront(nums);
        System.out.println(Arrays.toString(nums)); 
    }
}
