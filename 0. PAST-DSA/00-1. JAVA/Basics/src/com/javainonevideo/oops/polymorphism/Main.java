package com.javainonevideo.oops.polymorphism;

class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        System.out.println("\nMethod Overloading or Compile-time polymorphism");

        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(5, 6, 7));
    }
}
