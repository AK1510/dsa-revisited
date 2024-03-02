package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;

public class DuplicatesRemovalSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        System.out.println(Arrays.toString(nums));
        int k = 0; // last non-duplicate element index
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }
}
