package com.kourouma.training.datastructure.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] tab = new int[]{2, 7, 11, 15};
        int[] tab2 = new int[]{2, 1, 5, 3};
       // System.out.println(Arrays.toString(findIndices(tab, 26)));
        System.out.println(Arrays.toString(findIndicesOptimal(tab2, 4)));
    }

    private static int[] findIndices(int[] tab, int target) {

        for (int i = 0; i < tab.length; i++) {

            for (int j = i + 1; j < tab.length; j++) {

                if (tab[i] + tab[j] == target) {

                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    private static int[] findIndicesOptimal(int[] tab, int target) {
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < tab.length; i++) {
            Integer diff = target - tab[i];
            if( tracker.containsKey(diff)) {
                return new int[]{ tracker.get(diff),i};
            }else {
                tracker.put(tab[i], i);
            }
        }
        return new int[0];
    }
}
