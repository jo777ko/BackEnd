package de.telran.geork.homeworks.hw2;

public class CreditCard {
    protected int numberOfCard;
    protected int pinCode;
    protected int balance;
    protected int limit;
    protected int debt;

    public CreditCard(int numberOfCard, int pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;

    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setLimit(int limit) {
        if (limit > 0)
        this.limit = limit;
    }


    public void deposit(int pin, int m) {
        if (pinCode == pin && balance >= 0) {
            System.out.println(balance + m);
        } else if (pinCode == pin && balance < 0 && limit != 0) {
            System.out.println(m - Math.abs(balance));
        } else{
            System.out.println("Cancel");
        }
    }


    public void withdraw(int pin, int money){
        if(pinCode == pin && balance >= money ){
            System.out.println("Your balance: " + (balance - money));
        } else if(pinCode == pin && balance < money && limit >= (money - balance)){
            System.out.println("Your debt: " + (balance - money + debt));
        } else {
            System.out.println("Canceled, You don't have enough money.");
        }
    }
}

