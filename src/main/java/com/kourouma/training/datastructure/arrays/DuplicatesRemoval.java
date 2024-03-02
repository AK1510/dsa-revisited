package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesRemoval {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicatesV2(array)));
    }

    public static int[] removeDuplicates(int[] array) {

        Set<Integer> ans = new HashSet<>();
        for (int el : array) {
            ans.add(el);
        }
        return ans.stream().mapToInt( Integer::intValue).toArray();
    }

    public static int[] removeDuplicatesV2(int[] array) {

        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = i + 1; j < n; j++) {

                if (array[i] == array[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                uniqueArray[index++] = array[i];
            }
        }


        return Arrays.copyOf(uniqueArray, index);
    }

}
