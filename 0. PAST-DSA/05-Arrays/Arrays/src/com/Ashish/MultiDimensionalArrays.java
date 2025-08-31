package com.Ashish;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        System.out.println("Let's learn about multidimensional arrays");
        Scanner in = new Scanner(System.in);

        // Syntax of 2-D array
        // int[] arr = new int[][]
        // int[] arr = {{}, {}, {}}

        int[][] arr = new int[3][];
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr2[1][2]);
        System.out.println(arr.length); // it will give no. of rows we have.

        /*
         In Java, we do not necessarily have to define the size of rows and columns when initializing a multidimensional
         array. This is because Java supports jagged arrays, which are arrays where the length of each row can vary
         independently.
         */
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
    }
}
