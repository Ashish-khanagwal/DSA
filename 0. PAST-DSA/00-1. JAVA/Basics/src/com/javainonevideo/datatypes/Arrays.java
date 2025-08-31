package com.javainonevideo.datatypes;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays");

        int[] numbers = new int[5];         // Creates an int array of size 5, default all elements 0
        numbers[0] = 10;                    // Assign first element

        System.out.println("\nInteger value in array");
        int[] arr = {1, 2, 3, 4, 5};        // Creates and initializes an array with given values
        for (int numb : arr){
            System.out.println(numb);
        }

        System.out.println("\nString value in array");
        String[] names = {"Alice", "Bob"};

        for (String name : names){
            System.out.println(name);
        }


        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        // ENHANCED FOR LOOP -> The enhanced for loop (also called the for-each loop) in Java is a simplified way to iterate over arrays and collections, eliminating the need to manually manage an index or iterator.
        System.out.println("\nEnhanced For Loop");
        int[] numbers1 = {-3, 9, 45, 67};
        for (int num : numbers1){
            System.out.println(num);
        }
    }
}
