package lessons.mentor3.personal;/*
Created by Pavel Gryshchenko on 24.08.2022
*/

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", "Green", "Maiami", 100);
        Customer customer = new Customer("Jack", "Gray", "Florida", "25F87GTR");

        employee.display();
        System.out.println("**********");
        customer.display();
    }
}
