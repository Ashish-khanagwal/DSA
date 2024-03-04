package com.Ashish;

import java.util.Arrays;
import java.util.Scanner;

public class InputIn2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // This is how you take input in a 2-D array
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            } 
        }

        // This is how we will have our output printed (First way)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Second way
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Third way (enhanced for loop)
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
