package com.algorithms.easy;

import java.util.Arrays;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
        Take an array of integers, return the index of 2 numbers sum to the target
         */

        //sort the array
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while (left < right) {
            sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            else if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum solution = new twoSum();

        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

