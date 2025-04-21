package com.kourouma.training.datastructure.arrays;


/*

Given an array arr of size n, the task is to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order. If the array is sorted then return True, else return False.


Examples:
Input: n = 5, arr = [1,2,3,4,5]



Output: True



Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

Input: n = 5, arr = [5,4,6,7,8]



Output: False



Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False. Here element 5 is not smaller than or equal to its future elements.

Constraints:
1 ≤ n ≤ 106
- 109 ≤ arr[i] ≤ 109


 */
/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 20/04/2025
 */
public class CheckifArrayIsSorted {

    public static void main(String[] args) {
        int[] nums = {5,4,6,7,8}; // false
        int[] nums1 = {1,2,3,4,5}; // true
        System.out.println(isArraySortedAsc(nums));
        System.out.println("==========Second scenario =========");
        System.out.println(isArraySortedAsc(nums1));
    }

    public static boolean isArraySortedAsc(int[] nums){

        for (int i = 1; i < nums.length; i++) { // O(N)
            if(nums[i] < nums[i-1]) return false;
        }

        return true;
    }
}
