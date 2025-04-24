package com.kourouma.training.datastructure.arrays;
/*

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.



Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]


Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9


 */

import java.util.Arrays;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 24/04/2025
 */
public class DuplicatesZeroesExample {

    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicatesZeroes(nums);
    }

    private static void duplicatesZeroes(int[] nums) {

        int left = 0;
        int right = nums.length -1;


      while (left < right){
            if(nums[left] == 0){
                int tmp = nums[left+1];
                nums[left+1] = 0;
                nums[++left] = tmp;

            }else{
                right--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
