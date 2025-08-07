package com.javainonevideo.collectionframework.ListFramework;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        System.out.println("Array List");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(num);

//        num.remove(0);
        System.out.println(num);
        System.out.println(num.contains(3));
        System.out.println(num.get(0));

        System.out.println("\n");

        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        System.out.println("\n");

        for (int i : num) {
            System.out.println(i);
        }

        System.out.println("\n");

        num.forEach(number -> System.out.println(number));

        // Example program
        System.out.println("\n");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("PineApple");
        fruits.add("Orange");


        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n");
        
        for (int j = 0; j < fruits.size(); j++) {
            System.out.println("This fruit is: " + fruits.get(j));
        }

        // Example program-2
        ArrayList<String> names = new ArrayList<>();
        names.add("Ashish");
        names.add("Manish");
        names.add("Lalit");
        names.add("Saurav");

//        names.remove(2);
        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("\n");
        names.set(3, "Harsh");

        for (int k = 0; k < names.size(); k++) {
            System.out.println(names.get(k));
        }
    }
}
