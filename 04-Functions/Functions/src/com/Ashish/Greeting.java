package com.Ashish;

public class Greeting {
    public static void main(String[] args) {
        greeting(); // Calling or revoking the function
        // We can call the function as many times as we want.
        greeting();
        greeting();
        greeting();
        greeting();
        greeting();
    }

    // This is how we define the function.
    static void greeting() {
        System.out.println("Hello World!");
    }
}
