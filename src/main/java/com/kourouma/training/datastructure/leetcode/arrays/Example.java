package com.kourouma.training.datastructure.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        int[]nums = {8,1,2,2,3};
        //int[]nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counters = nums.clone();
        Arrays.sort(counters);

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indexes.putIfAbsent(counters[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            counters[i] = indexes.get(nums[i]);
        }
        return counters;
    }

}
