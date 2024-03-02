package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;

public class MoveZeroesInArray {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int tmp = nums[k];
                nums[k++] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
