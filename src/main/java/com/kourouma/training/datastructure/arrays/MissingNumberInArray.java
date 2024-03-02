package com.kourouma.training.datastructure.arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 6};
        System.out.println(findMissingNumberInArray(myArray, 6));
    }

    static int findMissingNumberInArray(int[] arr, int n) {

        int sum1 = 0;
        int sum2 = n * (n + 1) / 2;
        for (int el : arr) {
            sum1 += el;
        }

        return sum2 - sum1;
    }

}
