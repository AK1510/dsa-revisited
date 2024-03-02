package com.kourouma.training.datastructure.sorting;

public class SelectionSort {

    void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {

                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    void printArray(int [] arr){

        for (int i = 0; i < arr.length - 1; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
