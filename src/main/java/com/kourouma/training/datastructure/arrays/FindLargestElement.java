package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
/*


Given an array of integers nums, return the value of the largest element in the array


Examples:
Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6

Input: nums = [3, 3, 0, 99, -40]

Output: 99

Explanation: The largest element in array is 99


 */

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 20/04/2025
 */
public class FindLargestElement {

    public static void main(String[] args) {

        int[] nums = {3, 3, 0, 99, -40};
        System.out.println("========== Brute Force solution O(NLOGN)============");
        System.out.println(findLargestBF(nums));
        System.out.println("========== Optimum solution  O(N) ============");
        System.out.println(findLargestOS(nums));
    }

    private static int findLargestBF(int[]nums){
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    private static int findLargestOS(int[]nums){
        if(nums == null || nums.length == 0) return -1;
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
