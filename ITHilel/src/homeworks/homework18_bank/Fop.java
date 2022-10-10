package homeworks.homework18_bank;/*
Created by Pavel Gryshchenko on 10.10.2022
*/
/*
У ИП — пополнение с комиссией 1%, если сумма меньше 1000 $. И с комиссией 0,5%, если сумма больше либо равна 1000 $.
 */

class Fop extends Client {
    final int LOW_BALANCE_BORDER;

    {
        addBalanceCommission = 0.01;
        withdrawCommission = 0.0;
        LOW_BALANCE_BORDER = 1000;
    }

    Fop(int initAmount) {
        super(initAmount);
    }

    @Override
    void addBalance(int amount) {
        if (amount >= LOW_BALANCE_BORDER) {
            this.balance += amount - (amount * 0.005);
        } else {
            this.balance += amount - (amount * addBalanceCommission);
        }
    }

    @Override
    void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    int getBalance() {
        return this.balance;
    }

    @Override
    String getAccountInfo() {
        String info = "Fop info: \nAdd deposit more than $1000: " + this.addBalanceCommission * 100 + "%"
                + "\nAdd deposit less than $1000: " + (this.addBalanceCommission / 2) * 100 + "%" +
                "\nWithdraw: " + this.withdrawCommission * 100 + "%" + "\nBalance = " + getBalance() + "$";
        return info;
    }
}
