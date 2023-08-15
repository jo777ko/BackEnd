package de.telran.geork.homeworks.hw4.level1.bank;

import de.telran.geork.homeworks.hw2.CreditCard;

public class SimpleATM {
    private final int moneyLimit;



    public SimpleATM(CreditCard credit, int amount) {
        this.moneyLimit = amount;
    }

    public String checkBalance(CreditCard creditCard){
        return "Your card balance is $" + creditCard.getBalance();
    }

    public String withdraw(CreditCard creditCard, int money){
        if (moneyLimit >= money ){
            if ((creditCard.getLimit() + creditCard.getBalance()) >= (money + creditCard.getDebt())) {
                creditCard.setBalance(creditCard.getBalance() - money);
                return "Please, take your $" + money;
            }else{
                return "Your limit is over.";
            }
        } else {
            return "Bank doesn't have much money.";
        }
    }

    public String deposit(CreditCard card, int money){
//        card.setBalance(card.getBalance() + money);
       return "Your balance is :" + card.setBalance(card.getBalance() + money);
        }

}


