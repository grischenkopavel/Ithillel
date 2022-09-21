package lessons.lesson16.set_example;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        //size()
        System.out.println("hashSet.size() before adding elements " + hashSet.size());
        //isEmpty
        System.out.println("hashSet.isEmpty() before adding elements " + hashSet.isEmpty());
        //add
        hashSet.add(12);
        hashSet.add(22);
        hashSet.add(32);

        System.out.println("hashSet.size() after adding elements " + hashSet.size());
        System.out.println("hashSet.isEmpty() after adding elements " + hashSet.isEmpty());
        hashSet.add(22);
        printHashSet(hashSet);

        //contains()
        System.out.println("Is hasSet contain element 22 ? " + hashSet.contains(22));
        System.out.println("Is hasSet contain element 100 ? " + hashSet.contains(100));

        //remove element
        hashSet.remove(32);
        System.out.println("After removal element 32");
        printHashSet(hashSet);

        //clear
        hashSet.clear();
        System.out.println("HashSet after removal elements");
        System.out.println("hashSet after removal elements " + hashSet.size());
        printHashSet(hashSet);
    }
    static void printHashSet(HashSet<Integer> hashSetToPrint){
        for (Integer item: hashSetToPrint
             ) {
            System.out.println(item);
        }
    }
}
