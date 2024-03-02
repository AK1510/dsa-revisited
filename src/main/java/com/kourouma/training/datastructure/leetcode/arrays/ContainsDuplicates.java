package com.kourouma.training.datastructure.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        System.out.println(findDuplicateV2(nums1));
        System.out.println(findDuplicateV2(nums2));
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
}
