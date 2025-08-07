package com.javainonevideo.datatypes;

public class Bitwiseoperation {
    public static void main(String[] args) {
        System.out.println("Bitwise operator");
        int a = 5; // 0101
        int b = 3; // 0011

        // AND Operation
        System.out.println("AND Operation");
        System.out.println("5 & 3: " + (a & b));
        System.out.println("Binary " + Integer.toBinaryString(a & b));

        System.out.println("##########");

        // OR Operation
        System.out.println("\nOR Operation");
        System.out.println("5 | 3: " + (a | b));
        System.out.println("Binary: " + Integer.toBinaryString(a | b));

        System.out.println("##########");

        // XOR Operation
        System.out.println("\nXOR Operation");
        System.out.println("5 ^ 3: " + (a ^ b));
        System.out.println("Binary: " + Integer.toBinaryString(a ^ b));

        System.out.println("##########");

        // NOT Operation
        System.out.println("\nNot Operation");
        System.out.println("~5: " + (~a));
        System.out.println("Binary: " + Integer.toBinaryString(~a));

        System.out.println("##########");

        // LEFT Shift Operator
        System.out.println("\nLeft Shift Operator");
        System.out.println("5 << 1: " + (a << 1));
        System.out.println("Binary: " + Integer.toBinaryString(a << 1));

        System.out.println("##########");

        // Right Shift Operator
        System.out.println("\nRight Shift Operator");
        System.out.println("5 >> 1: " + (a >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(a >> 1));
    }
}
