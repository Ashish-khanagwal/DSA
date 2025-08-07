package com.javainonevideo.collectionframework.MapFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println("Linked Hash Map");
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Cat");
        map.put(1, "Dog");
        map.put(2, "Fish");
        map.put(1, "Horse"); // Key 1 is replaced

        System.out.println(map);
        System.out.println(map.keySet());

        for (Integer key : map.keySet()){
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }
}
