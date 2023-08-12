package de.telran.geork.homeworks.hw2;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(123456, 2508);
        card.setLimit(100);
        card.setBalance(0);
        card.deposit(2508,50);
        card.withdraw(2508, 100);
        card.deposit(2508,100);
        System.out.println(card.getBalance());








    }

}
