package com.Ashish;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 25;
        numbers[3] = 35;
        numbers[4] = 45;

        System.out.println("element of array is: " + numbers[3]);

        // Another way of declaring the array isf
        int[] num = {4, 5, 6, 7, 8}; // This works as another version of declaring works
        System.out.println("element of array is: " + num[3]);

        // This is how we take input in arrays (primitive data types)
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr)); // Way to print the whole array

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
        // Enhanced for-each loop (of the above loop)
        // The enhanced for loop provides a simplified syntax for iterating over elements in an array
        for (int j : arr) { // for every element in the array, print the element
            System.out.print(j + " "); // here, j represents an element of the array
        }

        // Input in an array of objects
        System.out.println("\n");
        String[] name = new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = in.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
