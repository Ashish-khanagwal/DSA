package com.javainonevideo.oops.polymorphism;

class Printer{
    void print(String s){
        System.out.println("String: " + s);
    }

    void print(int i){
        System.out.println("Int: " + i);
    }

    void print(double d){
        System.out.println("Double: " + d);
    }
}

public class differentParameters {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(2345);
        printer.print(45.544323432);
    }
}
