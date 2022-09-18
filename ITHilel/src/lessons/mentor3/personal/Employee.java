package lessons.mentor3.personal;/*
Created by Pavel Gryshchenko on 24.08.2022
*/

public class Employee extends Personal {
    private int salary;

    public Employee(String firstName, String lastName, String address, int salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary is: " + this.salary);
    }
}
