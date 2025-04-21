package com.kourouma.training.datastructure.codingame;

import java.util.stream.IntStream;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 05/04/2025
 */
public class DiscountApp {
    public static void main(String[] args) {

        int[] prices = {1, 4, 9, 12, 98, -10, 10};
        System.out.println(calculateTotalPriceV2(prices, 10));
    }

    public static int calculateTotalPrice(int[] prices, int discount) {

        if (prices == null || prices.length == 0) return 0;

        int maxIndex = getLargestIndex(prices);

        int sum = 0;

        for (int i = 0; i < prices.length; i++) {

            if (i == maxIndex) {
                sum += prices[i] * (100 - discount) / 100;
            } else {
                sum += prices[i];
            }
        }
        return sum;
    }

    private static int getLargestIndex(int[] prices) {

        // if(prices== null || prices.length == 0) return -1;

        int largest = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > prices[largest]) largest = i;
        }

        return largest;
    }

    private static int getLargestV2(int[] prices) {
        return IntStream.of(prices).max().getAsInt();
    }
    public static int calculateTotalPriceV2(int[] prices, int discount) {

        if (prices == null || prices.length == 0) return 0;

        int maxValue = getLargestV2(prices);

        int sum = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] == maxValue) {
                sum += maxValue * (100 - discount) / 100;
            } else {
                sum += prices[i];
            }
        }
        return sum;
    }
}
