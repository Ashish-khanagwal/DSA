package com.javainonevideo.datatypes;

public class conditionals {
    public static void main(String[] args) {
        System.out.println("Conditionals");
        boolean isRainy = false;
        boolean isSunny = true;

        if(isRainy) {
            System.out.println("Take an umbrella and enjoy the solitude");
        } else if(isSunny) {
            System.out.println("Go to Beach");
        } else {
            System.out.println("Sleep");
        }
    }
}
