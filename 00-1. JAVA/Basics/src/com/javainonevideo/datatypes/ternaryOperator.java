package com.javainonevideo.datatypes;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary Operator");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = scanner.nextInt();

//        variable = (condition) ? value_if_true : value_if_false;
//        If the condition is true, value_if_true is assigned or used.
//        If the condition is false, value_if_false is assigned or used

        String vote = (age >= 18) ? "you can vote" : "you can't vote";
        System.out.println(vote);
    }
}
