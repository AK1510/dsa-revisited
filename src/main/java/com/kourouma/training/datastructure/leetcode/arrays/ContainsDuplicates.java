package com.kourouma.training.datastructure.leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;


/*

Problem bloc:

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */


public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        System.out.println(findDuplicateV2(nums1));
        System.out.println(findDuplicateV2(nums2));
        Map<Integer, Integer> existing = new HashMap<>();


    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter( e -> e >= target).count();
    }
    private static boolean findDuplicate(int[] nums){
        Set<Integer> nonDuplicate = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nonDuplicate.size() != nums.length;
    }

    private static boolean findDuplicateV2(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if( set.contains(i)){
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }

    private static boolean hasDuplicates(int[]array){ return false;}
}


/*

Solution tips: Create a Set datastructure  from the array as it removes duplicates   and then compare its size with original array size
 */