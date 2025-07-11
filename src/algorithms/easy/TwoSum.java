package algorithms.easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
        Take an array of integers, return the index of 2 numbers sum to the target
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum solution = new TwoSum();

        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

