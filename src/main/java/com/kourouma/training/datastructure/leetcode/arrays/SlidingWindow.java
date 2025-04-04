package com.kourouma.training.datastructure.leetcode.arrays;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;

        for(String sentence : sentences){
            int length = sentence.strip().split(" ").length;
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
    private static int maxProfit(int[] prices) {
        if( prices.length < 1) return 0;
        int maxP = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {

            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxP;
    }
}
