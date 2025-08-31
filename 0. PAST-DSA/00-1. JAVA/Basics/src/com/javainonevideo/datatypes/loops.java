package com.javainonevideo.datatypes;

public class loops {
    public static void main(String[] args){
        System.out.println("Loops");

        System.out.println("\n<--FOR Loop-->");
        for(int i = 1; i <= 5; i++){
            System.out.println("Valar Morghulis");
        }

        System.out.println("\n<--While Loop-->");
        int a = 1;
        while(a <= 5){
            System.out.println("Valar Morghulis");
            a++;
        }

        System.out.println("\n<--Do While Loop-->");
        do{
            System.out.println("Valar Morghulis");
            a++;
        } while(a <= 0);
    }
}
