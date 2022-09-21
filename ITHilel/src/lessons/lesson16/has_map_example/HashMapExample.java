package lessons.lesson16.has_map_example;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        //add elements
        hashMap.put("Pavel","Java");
        hashMap.put("Sam","C++");
        hashMap.put("Brian","Python");
        hashMap.put("Greg","JavaScript");

        hashMapPrint(hashMap);
    }
    static void hashMapPrint(HashMap<String,String> hashMapToPrint){
        for (Map.Entry<String,String> element: hashMapToPrint.entrySet()
             ) {
            System.out.println(element.getKey() + " - " + element.getValue());
        }
    }
}
