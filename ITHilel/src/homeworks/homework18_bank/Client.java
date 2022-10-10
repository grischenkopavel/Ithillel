package homeworks.homework18_bank;/*
Created by Pavel Gryshchenko on 10.10.2022
*/

abstract class Client {
    protected int balance;
    protected double addBalanceCommission;
    protected double withdrawCommission;

    Client(int initAmount) {
        this.balance = initAmount;
    }

    abstract void addBalance(int amount);

    abstract void withdraw(int amount);

    abstract int getBalance();

    abstract String getAccountInfo();
}
