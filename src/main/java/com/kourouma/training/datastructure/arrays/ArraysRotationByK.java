package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 21/04/2025
 */
public class ArraysRotationByK {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println("==========Before Rotation==========");
        System.out.println(Arrays.toString(nums));
        System.out.println("==========After Rotation==========");
        System.out.println(Arrays.toString(rotateByLeft(nums, 3)));
    }

    private static int[] rotateByOneLeft(int[] nums) {
        int tmp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = tmp;

        return nums;
    }

    private static int[] rotateByLeft(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;

        for (int d = 0; d < k; d++) {
            int tmp = nums[0];
            for (int i = 0; i < n-1; i++) {
                nums[i] = nums[i+1];
            }
            nums[n - 1] = tmp;
        }

        return nums;
    }

    private static int[] rotateByKLeft(int[] nums, int k) {

        String m = "dkdkdk";
        m.length();
        int arrayLength = nums.length;
        k = k % arrayLength;
        int[] tmp = Arrays.copyOf(nums, k);

        for (int i = k; i < arrayLength; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = arrayLength - k; i < arrayLength; i++) {
            nums[i] = tmp[i - (arrayLength - k)];
        }

        return nums;
    }
}
