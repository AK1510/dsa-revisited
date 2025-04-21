package com.kourouma.training.datastructure.codingame;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 05/04/2025
 */
public class ClosestToZero {

    public static void main(String[] args) {

        int[] numbers = {-5,-2,-1,2,3,5,7,10,98};

        System.out.println(findClosestToZero(numbers));
    }

    private static int findClosestToZero(int[] ints){


        if(ints == null || ints.length == 0) return 0;

        int closest = ints[0];
        int min = Math.abs(ints[0]);

        for (int i = 1; i < ints.length; i++) {

            if( Math.abs(ints[i]) < min){
                min = Math.abs(ints[i]);
                closest = ints[i];
            } else if (Math.abs(ints[i]) == min) {

                if (ints[i] > closest ){
                  closest = ints[i];
                }
            }
        }
        return closest;
    }
}

