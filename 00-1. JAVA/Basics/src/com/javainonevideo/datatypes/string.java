package com.javainonevideo.datatypes;

public class string {
    public static void main(String[] args) {
        // STRING
//
//        int a = 1; // Stores in Stack
//        String str1 = "Hello"; // Stores in heap (string pool)
//        // str1 refers to the memory location, or we can say address of the word hello where it is stored.
//        String str2 = "Hello"; // Literal
//        String str3 = new String("Hello"); // Constructor (created a new object by using new keyword)
//
//        System.out.println(str1 == str2); // This is the way of checking the references not the values
//        System.out.println(a == a); // Here it is checking the values, as it is a primitive datatype
//        System.out.println(str1 == str3); // But here, str1 and str3 are different objects & referencing to different addresses.
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equals(str2));

//        String name = "Ashish";
//        name.toLowerCase();
//        System.out.println(name); // Print Ashish ->
        // In java, Strings are immutable meaning that methods like toLowerCase() do not modify the original string but instead return a new string with the transformation applied
        // reason - toLowerCase() creates new string, but we didn't store the results. so for correct way see below:-
        String name = "Ashish";
        name = name.toLowerCase();
        System.out.println(name); // this will print "ashish"

        // Common string operations
        String text = "Hello World";

        // Length of the string
        System.out.println(text.length());

        // Accessing the characters
        System.out.println(text.charAt(0));

        // Substring
        System.out.println(text.substring(0, 5));

        // Contains, startsWith, endsWith
//        System.out.println(text.contains("Hello")); True

        // Replace
        System.out.println(text.replace("World", "Java"));
    }
}
