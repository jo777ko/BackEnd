package de.telran.geork.homeworks.hw4.level1.bank;

import de.telran.geork.homeworks.hw2.CreditCard;

public class BankTest {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(1234, 2508);
        SimpleATM bank = new SimpleATM(card, 5000);
        card.setLimit(500);
        card.setBalance(10000);
        System.out.println(bank.checkBalance(card));
        System.out.println(bank.withdraw(card, 100));
        System.out.println(bank.deposit(card, 50));
        System.out.println(bank.withdraw(card, 100));
        System.out.println(bank.checkBalance(card));
    }
}
