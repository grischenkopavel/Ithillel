package lessons.lesson16.linked_hash_map_example;/*
Created by Pavel Gryshchenko on 22.09.2022
*/

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        //size()
        System.out.println("Size before adding elements " + linkedHashMap.size());

        linkedHashMap.put("USA", "dollar");
        linkedHashMap.put("France", "euro");
        linkedHashMap.put("Poland", "zloty");
        linkedHashMap.put("Slovakia", "euro");
        System.out.println("Size after adding elements " + linkedHashMap.size());

        //get value by key
        System.out.println("\nValue for key 'France' is " + linkedHashMap.get("France"));
        System.out.println("Value for key 'Germany' is " + linkedHashMap.get("Germany"));
        //contains
        System.out.println("\nDo we have value for key 'poland'? " + linkedHashMap.containsKey("Poland"));
        System.out.println("Do we have value for key 'Croatia'? " + linkedHashMap.containsKey("Croatia"));
        printLinkedHashMap(linkedHashMap);
    }

    static void printLinkedHashMap(LinkedHashMap<String, String> linkedHashMapToPrint) {
        for (Map.Entry<String, String> element : linkedHashMapToPrint.entrySet()
        ) {
            System.out.println(element);
        }
    }
}
