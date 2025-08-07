package com.javainonevideo.collectionframework.MapFramework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("Good Real-world Use Case: Counting Word Occurrences\n" +
                "Suppose you want to count how many times each word appears in a sentence.\n");

        String sentence = "Dogs Cat Lions Dogs Fish Cat";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words){
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCounts);
    }
}
