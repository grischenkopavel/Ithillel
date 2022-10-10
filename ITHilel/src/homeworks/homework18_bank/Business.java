package homeworks.homework18_bank;/*
Created by Pavel Gryshchenko on 10.10.2022
*/
/*
У юридических лиц — снятие с комиссией 1%.
 */

class Business extends Client {
    {
        addBalanceCommission = 0.0;
        withdrawCommission = 0.01;
    }

    Business(int initAmount) {
        super(initAmount);
    }

    @Override
    void addBalance(int amount) {
        this.balance += amount;
    }

    @Override
    void withdraw(int amount) {
        this.balance -= amount + (amount * withdrawCommission);
    }

    @Override
    int getBalance() {
        return this.balance;
    }

    @Override
    String getAccountInfo() {
        String info = "Business info: \nAdd deposit: " + this.addBalanceCommission + "%" +
                "\nWithdraw: " + this.withdrawCommission * 100 + "%" +
                "\nBalance = " + getBalance() + "$";
        return info;
    }
}
