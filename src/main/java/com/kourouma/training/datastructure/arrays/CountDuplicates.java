package com.kourouma.training.datastructure.arrays;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5};
        System.out.println(containsDuplicates(nums));
    }


    public static boolean containsDuplicates(int[] nums){

        if(nums.length == 1) return false;

        Set<Integer> distincts = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if( distincts.contains(nums[i])){
                return true;
            }else{
                distincts.add(nums[i]);
            }
        }

        return false;
    }
}
