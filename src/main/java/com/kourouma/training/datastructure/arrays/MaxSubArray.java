package com.kourouma.training.datastructure.arrays;

public class MaxSubArray {

    public static void main(String[] args) {

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(calculateMaxSubArray(nums));
    }

    public static int calculateMaxSubArray(int [] nums){

        int maxSub = nums[0];
        int curSum = 0;

        for (int n : nums) {

            if( curSum < 0)
                 curSum = 0;
            curSum += n;
            maxSub = Math.max(curSum, maxSub);
        }

        return maxSub;
    }
}
