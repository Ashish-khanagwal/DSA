package com.Ashish;

public class Shadowing {
    static int x = 90; // This has its own scope and can be used in any block of code that is inside block Shadowing.
    // above initialised variable will be shadowed by the variable declared at line 11.

    public static void main(String[] args) {
        System.out.println("Let's learn about Shadowing");
        System.out.println(x); // See, that 'x' is available in this scope too // 90

        int x = 40;
        System.out.println(x); // 40 --> The class variable at line 4 is shadowed by this.
        fun();
    }

    static void fun() {
        System.out.println(x); // available here also.
    }
}
