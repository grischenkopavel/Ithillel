package lessons.lesson17.stackExample;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

import java.util.Stack;

 class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
