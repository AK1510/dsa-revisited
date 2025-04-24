package com.kourouma.training.datastructure.arrays;

import java.util.*;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 22/04/2025
 */
public class MergeSortedArraysExample {

    public static void main(String[] args) {
        int array1[] = {0,3,4,31};
        int array2[] = {1,4,6,30};
// [0, 1, 3, 4, 6, 30, 31]
        mergeSortedArraysV2(array1, array2);
    }

    private static void mergeSortedArraysV1(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;

        Set<Integer> mergeSet = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            mergeSet.add(array1[i]);
        }

        for (int i = 0; i < n2; i++) {
            mergeSet.add(array2[i]);
        }

        System.out.println(Arrays.toString(mergeSet.toArray()));
    }

    private static void mergeSortedArraysV2(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2){

            if(array1[i] <= array2[j]){
                if(!union.contains(array1[i])){
                    union.add(array1[i]);
                }
                i++;
            }else{
                if(!union.contains(array2[j])){
                    union.add(array2[j]);
                }
                j++;
            }
        }
        while ( i < n1){
            union.add(array1[i] );
            i++;
        }

        while ( j < n2){
            union.add(array2[j] );
            j++;
        }

        System.out.println(union);
    }
}
