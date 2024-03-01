package com.Ashish;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(78);
        fun("ashish");
    }

    /* In order to have methods with same name, there are two things we have to consider are:
            1. both the methods should have different number of arguments if the arguments are of same type.
            2. Or both the methods should have same different type of arguments.
       So, that the methods won't throw any error.
     */

    static void fun(int a) {
        System.out.println("First method");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second method");
        System.out.println(name);
    }

}
