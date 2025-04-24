package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {

    public static void main(String[] args) {

        int[] nums = {2, -7, 7, 11, 15};
        int target = 22;

        System.out.println(Arrays.toString(twoSumV3(nums, target)));
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

        return new int[0];
    }

    public static int[] twoSumV2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }

        return new int[0];
    }

    public static int[] twoSumV3(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] + nums[right] == target) {

                return new int[]{nums[left], nums[right]};

            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
