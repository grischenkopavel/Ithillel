package lessons.mentor3.personal;/*
Created by Pavel Gryshchenko on 24.08.2022
*/

public class Personal {
    protected String firstName;
    protected String lastName;
    protected String address;

    public Personal(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + this.firstName + "\n" + "Last name: " + this.lastName);
        System.out.println("Address: " + this.address);
    }
}
