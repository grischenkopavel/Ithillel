package lessons.lesson16.has_map_example;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        //size()
        System.out.println("Size before adding elements is " + hashMap.size());
        //add elements
        hashMap.put("Pavel", "Java");
        hashMap.put("Sam", "C++");
        hashMap.put("Brian", "Python");
        hashMap.put("Greg", "JavaScript");

        //size()
        System.out.println("Size after adding elements is " + hashMap.size());
        hashMapPrint(hashMap);
        //get(Object key)
        System.out.println("\nvalue for key 'Pavel' is " + hashMap.get("Pavel"));
        System.out.println("value for key 'pavel' is " + hashMap.get("pavel"));
        //contains key
        System.out.println("\nDo we have key 'Pavel'? " + hashMap.containsKey("Pavel"));
        System.out.println("Do we have key 'Bob'? " + hashMap.containsKey("Bob"));
        //contains value
        System.out.println("\nDo we have value 'C++'? " + hashMap.containsValue("C++"));
        System.out.println("Do we have value 'C#'? " + hashMap.containsValue("C#"));
        //remove
        System.out.println("\nBefore removal key Greg ");
        hashMapPrint(hashMap);
        System.out.println("\nAfter removal key Greg " + hashMap.remove("Greg"));

        hashMapPrint(hashMap);
    }

    static void hashMapPrint(HashMap<String, String> hashMapToPrint) {
        for (Map.Entry<String, String> element : hashMapToPrint.entrySet()
        ) {
            System.out.println(element.getKey() + " - " + element.getValue());
        }
    }
}
