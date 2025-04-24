package com.kourouma.training.datastructure.arrays;

/*

You are given an integer array height of length n. There are n vertical lines are drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented
by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section)
the container can contain is 49.



 */

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 23/04/2025
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(calculateMaxQtyV2(height));
    }

    private static int calculateMaxQty(int[] height) { // O(N^2)

        int maxArea = 0;
        String pair = "";

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int area = width * h;
                if (maxArea < area) {
                    maxArea = area;
                    pair = "P1: {x=" + i + " height=" + height[i] + ", P2: x=" + j + " height=" + height[j] + "}";
                }
            }
        }

        System.out.println(pair);
        return maxArea;
    }
    private static int calculateMaxQtyV2(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1 ;

        while (left < right){
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width *  minHeight;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }

}
