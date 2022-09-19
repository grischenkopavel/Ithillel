package lessons.lesson17.QueueExample;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); //add to the beginning of queue
        queue.add(2);
        queue.add(3);
        queue.offer(22); //add to the end of queue

        queue.remove(2); // no exception handling
        //queue.poll(); // with exception handling
        for (int i : queue
             ) {
            System.out.println(i);
        }
        //peek return first element
        System.out.println(queue.peek());


        queueDemo();
        queuePriorityQueue();
    }
    static void queueDemo(){
        Queue<String> queue = new LinkedList<>();
        queue.add("banana");
        queue.add("apple");
        queue.add("strawberry");

        while (queue.peek() != null){
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
    }
    static void queuePriorityQueue(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("banana");
        queue.add("apple");
        queue.add("strawberry");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
