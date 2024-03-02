package com.kourouma.training.datastructure.arrays;

public class MaxProductArray {

    public static void main(String[] args) {

        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println(maxProduct(intArray));
    }

    public static String maxProduct(int[] intArray) {

        int maxProd = 0;
        String pairs = "";

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                int maxP = intArray[i] * intArray[j];
                if (maxProd < maxP) {
                    maxProd = maxP;
                    pairs = "(" + intArray[i] + "," + intArray[j] + ")";
                }
            }
        }
        return pairs;
    }
}
