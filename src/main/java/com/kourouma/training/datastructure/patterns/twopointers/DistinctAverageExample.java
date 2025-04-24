package com.kourouma.training.datastructure.patterns.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 24/04/2025
 */
public class DistinctAverageExample {
    public static void main(String[] args) {
int[] nums = {9,5,7,8,7,9,8,2,0,7};

        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        Set<Double> avg = new HashSet<>();

        while(left < right){
            avg.add( (nums[left]+ nums[right])/2.0);
            left++;
            right--;
        }

        return avg.size();
    }
}
