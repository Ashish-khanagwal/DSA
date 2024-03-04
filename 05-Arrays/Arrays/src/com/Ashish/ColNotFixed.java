package com.Ashish;

import java.util.Arrays;
import java.util.Scanner;

public class ColNotFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("When number of rows are fixed but number of columns are not fixed");

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8 , 9}
        };

        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
