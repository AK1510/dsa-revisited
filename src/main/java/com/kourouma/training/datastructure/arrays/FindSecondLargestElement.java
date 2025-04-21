package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
/*
Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Examples:
Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation: The largest value in nums is 8, the second largest is 7

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned


 */

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 20/04/2025
 */
public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] nums = {3, 3, 0, 99, -40};
        int[] nums1 = {10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(nums));
        System.out.println("========== Brute Force solution O(NLOGN)============");
        System.out.println(findSecondLargestOS(nums));
        System.out.println("========== Optimum solution  O(N) ============");
        System.out.println(findSecondSmallestOS(nums));

        int sSmallest = findSecondSmallestOS(nums);
        int sLargest = findSecondLargestOS(nums);
        int[] result = {sSmallest,sLargest};
        System.out.println("========== Optimum solution  O(N) ============");
        System.out.println(Arrays.toString(result));
    }

    private static int findSecondLargestBF(int[]nums){
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
        Arrays.sort(nums); // O(NlogN)
        int largest = nums[nums.length - 1];
        int secondLargest = -1;
        for (int i = nums.length - 2 ; i >= 0; i--) {  // O(N)
            if(largest != nums[i]){
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;
    }

    private static int findSecondLargestBetterS(int[]nums){
        if(nums == null || nums.length == 0) return -1;
        int largest = nums[0];
        int secondLargest = -1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    private static int findSecondLargestOS(int[]nums){
        if(nums == null || nums.length == 0) return -1;
        int largest = nums[0];
        int secondLargest = - 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    private static int findSecondSmallestOS(int[]nums){
        if(nums == null || nums.length == 0) return -1;
        int smallest = nums[0];
        int secondSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }else if( nums[i] != smallest && nums[i] < secondSmallest){
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }
}
