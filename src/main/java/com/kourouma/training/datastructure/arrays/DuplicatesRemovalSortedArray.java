package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemovalSortedArray {

    public static void main(String[] args) {

        int[] nums = {0, 0, 3, 3, 5, 6};

         System.out.println(removeDuplicates(nums));
        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
       // System.out.println(list);
        String str = "This is a string\nThis is the next line.\nHello world.";

        //System.out.println(str.lines().);
       // str.lines().forEach(System.out::println);
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        System.out.println("========Before Removal of duplicates =============");
        System.out.println(Arrays.toString(nums));
        int k = 0; // last non-duplicate element index
        for (int i = 1; i < nums.length; i++) { // O(N)

            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }
        System.out.println("========After Removal of duplicates =============");
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }
}
