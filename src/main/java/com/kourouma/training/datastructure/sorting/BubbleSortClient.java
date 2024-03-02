package com.kourouma.training.datastructure.sorting;

public class BubbleSortClient {

    public static void main(String[] args) {

        int arr[] = {10,5,30,15,50,6};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}
