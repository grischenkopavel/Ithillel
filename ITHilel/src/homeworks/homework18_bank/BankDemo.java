package homeworks.homework18_bank;/*
Created by Pavel Gryshchenko on 10.10.2022
*/
/*
Что нужно сделать
1. Создайте классы, представляющие клиентов банка: абстрактный класс Client, классы для физических лиц, юридических лиц и индивидуальных предпринимателей.

У каждого клиента есть сумма денег на счету (число). Деньги можно положить на счёт, снять и вернуть остаток на счёте.
Каждый класс должен содержать метод, который выводит информацию в консоль о счёте: условие пополнения, условие снятия и баланс.

2. Реализуйте методы, при которых:
У физических лиц пополнение и снятие происходит без комиссии.
У юридических лиц — снятие с комиссией 1%.
У ИП — пополнение с комиссией 1%, если сумма меньше 1000 $. И с комиссией 0,5%, если сумма больше либо равна 1000 $.
 */

public class BankDemo {
    public static void main(String[] args) {
        Individual person = new Individual(0);
        person.addBalance(100);
        System.out.println(person.getBalance());
        person.withdraw(50);
        System.out.println(person.getBalance());
        System.out.println(person.getAccountInfo());

        Business business = new Business(0);
        business.addBalance(200);
        System.out.println(business.getBalance());
        business.withdraw(100);
        System.out.println(business.getBalance());
        System.out.println(business.getAccountInfo());

        Fop fop = new Fop(0);
        fop.addBalance(1000);
        System.out.println(fop.getBalance());
        fop.withdraw(500);
        System.out.println(fop.getBalance());
        System.out.println(fop.getAccountInfo());
    }
}
