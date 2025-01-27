package atm.state;

import atm.models.ATMMachine;
import atm.models.Card;

public interface State {
    void insertCard(ATMMachine atmMachine, Card card);

    void validatePin(ATMMachine atmMachine, Card card, int pin);

    void selectOperationToPerform(ATMMachine atmMachine, Card card, ATMOperations atmOperations);

    void getTotalBalance(ATMMachine atmMachine, Card card);

    void withdrawMoney(ATMMachine atmMachine, Card card, int amount);

    void endTransaction(ATMMachine atmMachine, Card card);

    void returnCard(ATMMachine atmMachine, Card card);
}
