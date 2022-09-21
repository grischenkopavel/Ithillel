package lessons.lesson14.linked_list;/*
Created by Pavel Gryshchenko on 21.09.2022
*/

import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(50);
        linkedList.add(150);
        linkedList.add(250);

        linkedList.add(3,350);

        printLinkedList(linkedList);
    }
    static void printLinkedList(LinkedList<Integer> listToPrint){
        for (Integer element: listToPrint) {
            System.out.println(element);
        }
    }
}
