package lessons.lesson16.tree_set_example;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("B");
        treeSet.add("E");
        System.out.println(treeSet);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(25);
        integerTreeSet.add(52);
        integerTreeSet.add(2);
        integerTreeSet.add(200);
        integerTreeSet.add(200);
        integerTreeSet.add(38);
        System.out.println(integerTreeSet);
    }
}
