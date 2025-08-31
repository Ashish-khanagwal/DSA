package com.Ashish;

public class PassingExplanation {
    public static void main(String[] args) {
        String name = "Ashish Khanagwal";
        greet(name);

        // Here, the name and the naam (in method) doesn't have to be the same. Understand this concept as
        /*

        In java there is no concept like "Pass by reference", it has "Pass by value".

        Pass by Value: When you pass a variable to a method in Java, you're actually passing a copy of the
        variable's value, not the variable itself. The method can change the copy, but it doesn't affect the
        original variable outside the method. It's like giving a copy of your toy to a friend to play with.
        Your friend can do whatever they want with the copy, but it doesn't change your original toy.

        Pass by Reference: In some programming languages, like C++ or Python, you can pass variables by reference,
        which means you're passing the memory address of the variable, not a copy of its value.
        This allows the method to directly access and modify the original variable. But in Java,
        you can't do this. You always pass variables by value, meaning you pass a copy of the variable's value,
        not the variable itself.

        So, in simple terms, in Java, when you give something to a method, you're giving it a copy to play with,
        not the real thing.
         */

        // For example check swap.java

        // For primitive data types it going to pass by value
        // And in object and references it going to pass by value of that reference variable. (Explanation below)
        /*
        Reference Variable: In Java, when you create an object (like a String, ArrayList, or a custom class),
        you're actually creating a reference variable that points to the memory location where the object is
        stored. This reference variable holds the memory address of the object.

        Now, let's combine these two concepts:

        When you pass a reference variable to a method, you're passing a copy of its value.
        This value is the memory address (or reference) of the object it points to.
        So, technically, you're passing the reference by value.
         */
    }

    static void greet(String naam){
        System.out.println("Hello " + naam);
    }
}
