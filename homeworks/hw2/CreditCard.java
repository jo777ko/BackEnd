package de.telran.geork.homeworks.hw2;

public class CreditCard {
    protected int numberOfCard;
    protected int pinCode;
    protected double balance;
    protected double limit;
    protected double debt;

    public CreditCard(int numberOfCard, int pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;

    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public double setLimit(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
        return limit;
    }

    public double getDebt() {
        return debt;
    }

    public double getLimit() {
        return limit;
    }

    public String invalidPin() {
        System.out.println("Your pin is incorrect.");
        return "Your pin is incorrect.";
    }


    public String deposit(int pin, double m) {
        if (pinCode == pin) {
            if (balance >= 0) {
                balance += m;
                return String.valueOf(balance);
            } else if (pinCode == pin && balance < 0 && limit != 0) {
                balance = m - Math.abs(balance);
                return String.valueOf(balance);
            } else {
                System.out.println("Cancel");
                return ("Cancel");
            }
        } else {
            return invalidPin();
        }

    }


    public String withdraw(int pin, int money) {
        if (pinCode == pin) {
            if (balance >= money) {
                balance -= money;
                return String.valueOf(balance);
            } else if (balance < money ) {
                if ((debt + money) <= (limit + balance )){
                    debt = balance - money;
                        balance = debt;
                    return String.valueOf(balance);
                } else{
                    System.out.println("Your limit is over");
                    return ("Your limit is over");
                }
            } else {
                System.out.println("Canceled, You don't have enough money.");
                return "Canceled, You don't have enough money.";
            }
        } else {
            return invalidPin();
        }
    }
}

