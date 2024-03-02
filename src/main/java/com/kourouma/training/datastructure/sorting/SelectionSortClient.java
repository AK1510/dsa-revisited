package com.kourouma.training.datastructure.sorting;

public class SelectionSortClient {
    public static void main(String[] args) {

        int arr[] = {10,5,30,15,50,6};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.printArray(arr);
        selectionSort.selectionSort(arr);
        selectionSort.printArray(arr);
    }
}
