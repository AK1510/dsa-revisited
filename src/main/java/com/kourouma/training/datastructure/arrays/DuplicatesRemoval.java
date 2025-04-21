package com.kourouma.training.datastructure.arrays;

import java.util.*;

public class DuplicatesRemoval {

    public static void main(String[] args) {
        Integer[] array = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(filterDuplicates(array)));
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
    public static  Integer[] filterDuplicates(Integer[] data) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int element : data) {
            if (seen.add(element)) { // Returns true if the element was not present
                result.add(element);
            }
        }
        return result.toArray(Arrays.copyOf(data, result.size()));
    }
}
