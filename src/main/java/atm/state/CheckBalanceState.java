package atm.state;

import atm.models.ATMMachine;
import atm.models.Card;

public class CheckBalanceState implements State {
    @Override
    public void insertCard(ATMMachine atmMachine, Card card) {
        System.out.println("Oops not allowed now");
    }

    @Override
    public void validatePin(ATMMachine atmMachine, Card card, int pin) {
        System.out.println("Oops not allowed now");

    }

    @Override
    public void selectOperationToPerform(ATMMachine atmMachine, Card card, ATMOperations atmOperations) {
        System.out.println("Oops not allowed now");

    }

    @Override
    public void getTotalBalance(ATMMachine atmMachine, Card card) {
        System.out.println("Checking balance....");
        System.out.println("Current balance is: " + card.getBankAccount().getTotalBalance());
        atmMachine.setState(new SelectionState());
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, Card card, int amount) {
        System.out.println("Oops not allowed now");
    }

    public void endTransaction(ATMMachine atmMachine, Card card) {
        //TODO
        System.out.println("Ending Transaction.....");
        returnCard(atmMachine, card);
    }

    public void returnCard(ATMMachine atmMachine, Card card) {
        //TODO
        System.out.println("Please collect the card....");
        atmMachine.setState(new IdleState());
    }

}
