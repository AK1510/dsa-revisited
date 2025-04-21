package com.kourouma.training.datastructure.codingame;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author akourouma
 * @version 1.0
 * @project datastructures
 * @license GUINEA MARKETPLACE
 * @email kouroumaa@yahoo.fr
 * @since 06/04/2025
 */
public class ColisApp {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
       /* while (true) {
            int width = in.nextInt();
            int height = in.nextInt();
            int length = in.nextInt();
            int mass = in.nextInt();
            PrintStream outStream = System.out;
            System.setOut(System.err);
            String action = solve(width, height, length, mass);
            System.setOut(outStream);
            System.out.println(action);
        }*/

        System.out.println(a(1,5));
        System.out.println(a(2,3));
        System.out.println(a(-3,4));
    }

    private static String solve(int width, int height, int length, int mass) {

        int volume = width * height * length;
        boolean encombrant = (volume > 1_000_000 || (width > 150 || height > 150 || length > 150));
        boolean lourd = (mass >= 20);

        if (encombrant && lourd) {
            return "REJECTED";
        } else if (encombrant || lourd) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    static boolean a(int i, int j){

        return (i == 1 || j == 1 || (i+j) == 1);
    }
}

