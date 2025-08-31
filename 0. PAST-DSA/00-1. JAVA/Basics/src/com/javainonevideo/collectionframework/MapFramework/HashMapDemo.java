package com.javainonevideo.collectionframework.MapFramework;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("HashMap");
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Y. Jasiwal");
        names.put(2, "KL Rahul");
        names.put(3, "Sai Sudharshan");
        names.put(4, "Shubhman Gill");
        names.put(4, "Rishabh Pant");

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.get(3));
        System.out.println(names.containsKey(4));
        System.out.println(names.containsValue("Rishabh Pant"));
//        System.out.println(names.remove(3));
//        System.out.println(names);
        System.out.println(names.size());
//        names.clear();
//        System.out.println(names);

        System.out.println(names.keySet());
        System.out.println(names.values());

        for (Integer key : names.keySet()) {
            System.out.println("Key: " + key + " Value: " + names.get(key));
        }
    }
}
