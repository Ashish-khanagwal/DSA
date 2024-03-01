package com.Ashish;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // In java this is how we swap values.
//        int temp = a;
//        a = b;
//        b = temp;

        // Let's create a method to swap the values. And see what actually happens.
         swap(10, 20);
         // here we will notice that the values aren't swapped.
        // Explanation of it can be seen at PassingExplanation.java
        System.out.println("a is: " + a + " & " + "b is: " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
