package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9 ;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i]; // [nums[i], diff]

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[0] ;
    }
}
