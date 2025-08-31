package com.javainonevideo.collectionframework.MapFramework;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        System.out.println("Use Case: Maintaining Recent Login Order for Users\n" +
                "Suppose you are building a web application and want to display the last 5 users who logged in, always in the order they logged in. For this, you need a data structure that maintains insertion order (so you know who's most recent) and ensures each username appears only once (if a user logs in again, update their position).\n" +
                "-> A LinkedHashMap is perfect for this, as it:\n" +
                "-> Stores key-value pairs (e.g., username → login time)\n" +
                "-> Maintains the order in which entries were added or accessed\n" +
                "-> Makes it easy to remove the oldest entry when new logins arrive\n");

        System.out.println("Solution --> \n");

        
    }
}
