package lessons.lesson11.static_example;/*
Created by Pavel Gryshchenko on 22.08.2022
*/

class Main {
    public static void main(String[] args) {
        System.out.println(Cat.name);
        Cat.sayHello();


        Tree.staticExample += 20;
        System.out.println("staticExample: " + Tree.staticExample);

        Tree tree1 = new Tree();
        System.out.println("Static variable for object tree1 is " + tree1.staticExample); // the same if code will be Tree.staticExample. No sense to attach static variable to object tree1
        tree1.nonStaticExample += 20;
        System.out.println("Non Static variable for object tree1 is " + tree1.nonStaticExample);

        Tree tree2 = new Tree();
        System.out.println("Static variable for object tree2 is " + tree2.staticExample); // the same if code will be Tree.staticExample
        System.out.println("Static variable for object tree2 is " + tree2.nonStaticExample);

    }
}
