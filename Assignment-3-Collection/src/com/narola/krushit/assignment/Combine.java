package com.narola.krushit.assignment;

import java.util.*;

public class Combine {
    public static void main(String[] args) {
        /*
        Combined Assignment: Working with List, Set, and Map
            1. Write a program that:
                ○ Reads a list of names from the user.
                ○ Stores unique names in a Set.
                ○ Counts the frequency of each name using a Map.
                ○ Displays the sorted list of names and their counts.
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("Krushit");
        stringList.add("Sujal");
        stringList.add("Vinay");
        stringList.add("Vikas");
        stringList.add("Arpan");
        stringList.add("Vinay");
        stringList.add("Sujal");

        System.out.println("List :: " + stringList);

        Set<String> stringSet = new HashSet<>();
        for(String names : stringList){
            stringSet.add(names);
        }

        System.out.println("Set :: " + stringSet);

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for(String names : stringList){
            stringIntegerMap.put(names, stringIntegerMap.getOrDefault(names, 0) + 1);
        }

        System.out.println("Map :: " + stringIntegerMap);
        //Collections.
    }
}
