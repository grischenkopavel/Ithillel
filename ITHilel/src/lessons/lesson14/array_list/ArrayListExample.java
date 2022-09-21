package lessons.lesson14.array_list;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayListExmpl = new ArrayList<>();

        //add elements
        arrayListExmpl.add("USA");
        arrayListExmpl.add("Canada");
        arrayListExmpl.add("Mexico");
        //add elements by index
        arrayListExmpl.add(0,"Cuba");

        printArrayList(arrayListExmpl);

        //get(int index)
        System.out.println("Element by index 3 is " + arrayListExmpl.get(3));

        //indexOf(Object o)
        System.out.println("index of element USA is " + arrayListExmpl.indexOf("Canada"));
        System.out.println("index of element USA is " + arrayListExmpl.indexOf("France"));

        //set(int index, T element)
        arrayListExmpl.set(3, "Brazil");
        printArrayList(arrayListExmpl);

        //remove elements by index
        arrayListExmpl.remove(3);
        System.out.println("Array after removal element with index 3");
        printArrayList(arrayListExmpl);
        //remove elements by Object
        arrayListExmpl.remove("Canada");
        System.out.println("Array after removal object Canada");
        printArrayList(arrayListExmpl);
    }
    static void printArrayList(ArrayList<String> arrayToPrint){
        for (String element: arrayToPrint) {
            System.out.println(element);
        }
    }
}
