package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        This is how we can get <<OUTPUT>>
        System.out.println("Hello world");
//        This will give output as [Hello world] and adds a new line due to 'ln'. use print only, if don't want to add new line
        System.out.println("My name is Ashish");

//      <<Without println>>
//        System.out.print("Hello world");
//        System.out.println("My name is Ashish");
//        It won't create new line and gives output [Hello worldMy name is Ashish]

//        <<INPUT>>
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
//        nextLine will print whole line of strings.
//        Here, scanner is just a class which allows us to take input.
    }
}