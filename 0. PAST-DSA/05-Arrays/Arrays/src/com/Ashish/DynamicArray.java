package com.Ashish;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's learn about array list or dynamic arrays: ");

        // What is an Array list?
        /*
            An ArrayList in Java is a dynamic array that can resize itself automatically when elements are added or removed.
            Unlike traditional arrays, ArrayLists can grow or shrink in size dynamically at runtime
        */

        // Why do we need an Array list?
        /*
            1. Dynamic Sizing: ArrayLists automatically resize themselves, allowing you to add or remove elements without
               worrying about the size of the underlying array.
            2. Easy to Use: ArrayLists provide convenient methods to add, remove, and access elements, making them easier
               to work with than traditional arrays.
            3. Flexible: ArrayLists can hold objects of any type, including custom objects, and can be easily passed around
               in Java programs.
        */

        // Syntax
        /*
            ArrayList<Datatype> name = new ArrayList<>();
        */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);

        System.out.println(numbers);

        numbers.set(2, 99);
        System.out.println(numbers);

        System.out.println(numbers.contains(99));

        numbers.remove(2);
        System.out.println(numbers);
    }
}
