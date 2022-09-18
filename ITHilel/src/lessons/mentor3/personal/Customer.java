package lessons.mentor3.personal;/*
Created by Pavel Gryshchenko on 24.08.2022
*/

public class Customer extends Personal {
    private String account;

    public Customer(String firstName, String lastName, String address, String account) {
        super(firstName, lastName, address);
        this.account = account;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bank account is: " + this.account);
    }
}
