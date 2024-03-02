package com.kourouma.training.datastructure.arrays;

public class FinalValueOp {

    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String op: operations) {
            switch (op){
                case "++X":
                case "X++": ans += 1; break;

                case "--X":
                case "X--": ans -= 1; break;
                default: break;
            }
        }
        return ans;
    }

}
