package com.javainonevideo.collectionframework.SetFramework;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Banana"); // Duplicate, ignored

        System.out.println(set); // Output: [Apple, Banana, Mango]
        System.out.println(set.contains("Apple")); // true

        set.remove("Mango");
        System.out.println(set); // Output: [Apple, Banana]

//        Example: Collecting unique URLs visited by a user (in order)
//        Suppose you are tracking a user's browsing history and want to list only unique URLs in the order they visited.

//        List<String> urls = Arrays.asList("google.com", "stackoverflow.com", "hackerrank.com", "youtube.com", "intagram.com");

        String[] urls = {"google.com", "stackoverflow.com", "hackerrank.com", "youtube.com", "intagram.com"};
        LinkedHashSet<String> urlsinorder = new LinkedHashSet<>();
        for (String orderredurl : urls){
            urlsinorder.add(orderredurl);
        }
        System.out.println(urlsinorder);

        // approach-2
        String[] urlss = {
                "google.com", "stackoverflow.com", "hackerrank.com", "youtube.com", "intagram.com"
        };

        LinkedHashSet<String> uniqueUrls = new LinkedHashSet<>();
        for (String url : urlss) {
            uniqueUrls.add(url);
        }

        System.out.println(uniqueUrls);
    }
}
