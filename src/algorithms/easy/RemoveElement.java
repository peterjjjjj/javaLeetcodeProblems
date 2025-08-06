package algorithms.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //Given an int array nums, int val, remove all occurrences of val in nums in place.
        //Return the number of elements in nums which are not equal to val.

        //Initialize k.
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            //Found the target val.
            if (nums[i] == val) {
                //Set it to 101.
                nums[i] = 101;
                //Increment.
                k++;
            }
        }

        Arrays.sort(nums);

        return k;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 2;

        System.out.println(removeElement.removeElement(nums, val));
    }
}


