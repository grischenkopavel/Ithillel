package homeworks.homework18_bank;/*
Created by Pavel Gryshchenko on 10.10.2022
*/

/*
У физических лиц пополнение и снятие происходит без комиссии.
 */
class Individual extends Client {
    {
        addBalanceCommission = 0.0;
        withdrawCommission = 0.0;
    }

    Individual(int initAmount) {
        super(initAmount);
    }

    @Override
    void addBalance(int amount) {
        this.balance += amount;
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
        String info = "Individual info: \nAdd deposit: " + this.addBalanceCommission + "%" +
                "\nWithdraw: " + this.withdrawCommission + "%" +
                "\nBalance = " + getBalance() + "$";
        return info;
    }
}
