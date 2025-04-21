package com.misterkourouma.trainings;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author akourouma
 * @version 1.0
 * @project effectiveJava
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 03/04/2025
 */
public class DemoApp {

    public static void main(String[] args) {

        String[] words = {"f", "o", "o", "bar"};

        //System.out.println(concat(words));

        // System.out.println(computeMultipleSum(0));
        int[] tab = {1, 4, 9, 12, 98, -10, 10};
        System.out.println(sumRange(tab));

        System.out.println(IntStream.of(tab).average().getAsDouble());

    }

    public static String concat(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String s : words
        ) {
            sb.append(s);
        }
        return String.join("", words);
        //  return sb.toString();
    }

    static int computeMultipleSum(int n) {
        int sum = 0;

        for (int i = 3; i < n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    static int sumRange(int[] ints) {
        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];

            if (n >= 10 || n <= 100) {
                sum += n;
            }
        }

        return sum;
    }

    private static boolean isTwin(String a, String b) {

        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;

        a = a.toUpperCase();
        b = b.toUpperCase();

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar, bChar);
    }
}
