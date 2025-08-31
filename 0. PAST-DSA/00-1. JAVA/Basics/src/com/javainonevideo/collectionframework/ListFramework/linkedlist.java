package com.javainonevideo.collectionframework.ListFramework;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        System.out.println("Linked List");

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Gurgaon");

        System.out.println(cities);
        cities.addFirst("Hyderabad");

        System.out.println(cities);

        cities.addLast("Pune");
        System.out.println(cities);

        System.out.println("\nEnhanced For Loop");
        for (String city : cities){
            System.out.println("This city is: " + city);
        }

        System.out.println("\nFor Loop");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("This city is: " + cities.get(i));
        }

        System.out.println("First: " + cities.peekFirst());

        System.out.println("Last " + cities.peekLast());

        cities.offer("Ahmedabad");
        System.out.println(cities);

        String polled = cities.poll();
        System.out.println("Polled " + polled);
        System.out.println("List after polled: " + cities);
    }
}
