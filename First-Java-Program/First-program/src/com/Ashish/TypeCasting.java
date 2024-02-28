package com.Ashish;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("TypeCasting");
        Scanner in = new Scanner(System.in);

        // If we give input as integer it will be fine because, java does implicitly type conversion from int to float
        System.out.print("Enter the number: ");
        float number = in.nextFloat();
        System.out.println("your entered number is: " + number);

        // conversion of float to int
//        float number = in.nextFloat();
        int integer = (int)(number); // type conversion of float into integer
        System.out.println("your entered integer is: " + integer);

        // conversion of char into integer
        char letter = 'A';
        int num = (int)(letter);
        System.out.println( "converted value from char to int is: " + num);

        byte b = 4;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 7.43f;
        double d = 0.34234;
        double result = (f * b) + (i / c) - (d * s);
//        float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
