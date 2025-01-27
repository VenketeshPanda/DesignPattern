package atm.state;

import atm.models.ATMMachine;
import atm.models.Card;

public class ValidateCardState implements State {
    @Override
    public void insertCard(ATMMachine atmMachine, Card card) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void validatePin(ATMMachine atmMachine, Card card, int pin) {
        //TODO
        System.out.println("VALIDATING PIN....");
        if (card.validatePIN(pin)) {
            System.out.println("PIN VALIDATED..");
            atmMachine.setState(new SelectionState());
        } else {
            System.out.println("Oh no, the pin validation failed");
            endTransaction(atmMachine, card);
        }
    }

    @Override
    public void selectOperationToPerform(ATMMachine atmMachine, Card card, ATMOperations atmOperations) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void getTotalBalance(ATMMachine atmMachine, Card card) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, Card card, int amount) {
        System.out.println("Oops, not allowed now...");
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
