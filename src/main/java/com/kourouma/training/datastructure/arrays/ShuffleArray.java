package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        Arrays.stream(nums).distinct().count();

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[n];
            }
        }
        return ans;
    }


}
