package lessons.lesson17;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

 class Person {
    private String fullName;
    private int age;
    private  boolean retired;

    public Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", retired = " + retired +" "+
                '}';
    }
}
