package com.kourouma.training.datastructure.arrays;

import java.util.Arrays;

public class BestScoresExample {

    public static void main(String[] args) {

        int []myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println( Arrays.toString(findTopTwoScoresV2(myArray)));
    }

    public static int[] findTopTwoScores(int[] array){
        Arrays.sort(array);
        return new int[]{ array[array.length - 2], array[array.length - 1]};
    }

    public static int[] findTopTwoScoresV2(int[] array){
       int firstHighest = Integer.MIN_VALUE;
       int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if( score > firstHighest){
                secondHighest = firstHighest;
                firstHighest = score;
            } else if ( score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{ firstHighest, secondHighest};
    }
}
