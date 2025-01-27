package atm.state;

import atm.models.ATMMachine;
import atm.models.Card;

public class SelectionState implements State {
    @Override
    public void insertCard(ATMMachine atmMachine, Card card) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void validatePin(ATMMachine atmMachine, Card card, int pin) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void selectOperationToPerform(ATMMachine atmMachine, Card card, ATMOperations atmOperations) {
        //TODO
        if (atmOperations.equals(ATMOperations.CHECK_BALANCE)) {
            System.out.println("SELECTED CHECK BALANCE OPERATION.....");
            atmMachine.setState(new CheckBalanceState());
        } else if (atmOperations.equals(ATMOperations.WITHDRAW_MONEY)) {
            System.out.println("SELECTED WITHDRAW MONEY OPERATION.....");
            atmMachine.setState(new WithdrawMoneyState());
        } else if (atmOperations.equals(ATMOperations.END_TRANSACTION)) {
            System.out.println("SELECTED ENDING TRANSACTION....");
            endTransaction(atmMachine, card);
        }
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
