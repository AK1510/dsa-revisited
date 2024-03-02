package com.kourouma.training.datastructure.leetcode.arrays;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        int arr[] = { 10, 3, 5, 6, 2 };
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
    }

    private static int[] calculateProduct(int[] nums) {
        int[] product = new int[nums.length];
        Arrays.fill(product, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product[i] *= nums[j];
                }
            }
        }
        return product;
    }

    private static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return new int[0];

        int[] product = new int[n];
        Arrays.fill(product, 1);
        int prefix = 1;
        for (int i = 0; i <= n - 1; i++) {
            product[i] = prefix;
            prefix *= nums[i];
            System.out.println("i = " + i  + " : "+ prefix);
        }
        int postfix = 1;
        for (int j = n - 1; j >= 0; j--) {
            product[j] *= postfix;
            postfix *= nums[j];
            System.out.println("j = " + j  + " : "+ postfix);
        }
        return product;
    }
}
