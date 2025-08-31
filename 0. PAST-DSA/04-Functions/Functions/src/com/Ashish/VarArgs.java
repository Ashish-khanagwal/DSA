package com.Ashish;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Let's learn about variable length arguments");
        fun(5, 6, 8, 9, 23);
        multiple(5, 54, "Ashish", "Khanagwal");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){ // by using "...v" we can have 0 or more than 0 arguments
        System.out.println(Arrays.toString(v));
    }
}
