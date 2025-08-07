package com.javainonevideo.collectionframework.SetFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class hashset {
    public static void main(String[] args) {
        System.out.println("Hash Set");

        HashSet<String> sports = new HashSet<>();
        sports.add("Cricket");
        sports.add("Tennis");
        sports.add("Football");
        sports.add("Baseball");
        sports.add("Archery");
        sports.add("Archery"); // duplicate won't be added again
        System.out.println(sports);

        System.out.println(sports.contains("Football"));
        sports.remove("Archery");
        System.out.println(sports);
        System.out.println(sports.isEmpty());
//        System.out.println(sports.iterator());

//        Suppose you have a list of student names which may have duplicates, and you want a list of unique names.
        List<String> students = Arrays.asList("Ashish", "Manish", "Lalit", "Manish", "Saurav");
        HashSet<String> uniquenamess = new HashSet<>(students);
        System.out.println(uniquenamess);
    }
}
