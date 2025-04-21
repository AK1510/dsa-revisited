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
public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
       // System.out.println(Arrays.toString(moveZeroesV1(nums)));
        moveZeroesV2(nums);
    }

    private static int[] moveZeroesV1(int[] nums) {
        int[] tmp = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                tmp[k] = nums[i];
                k++;
            }
        }

        System.out.println("=========");
        System.out.println(Arrays.toString(tmp));
        System.out.println("=========");
        return Arrays.stream(nums).filter(i -> i != 0).toArray();
    }

    private static void moveZeroesV2(int[] nums) {

        int k = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k = i;
                break;
            }
        }

        if(k == -1) return ; // No zero present in the array

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int tmp = nums[k];
                nums[k] = nums[i];
                nums[i] = tmp;
                k++;
            }
        }

        System.out.println("=========");
        System.out.println(Arrays.toString(nums));
        System.out.println("=========");

    }
}
