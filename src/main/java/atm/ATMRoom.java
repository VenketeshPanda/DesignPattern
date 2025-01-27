package atm;

import atm.models.ATMMachine;
import atm.models.BankAccount;
import atm.models.Card;
import atm.state.ATMOperations;

public class ATMRoom {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(4500, 3, 5, 5);
        Card card = new Card(new BankAccount(3000));

        atmMachine.getState().insertCard(atmMachine, card);
        atmMachine.getState().validatePin(atmMachine, card, 1221);
        atmMachine.getState().selectOperationToPerform(atmMachine, card, ATMOperations.CHECK_BALANCE);
        atmMachine.getState().getTotalBalance(atmMachine, card);
        atmMachine.getState().selectOperationToPerform(atmMachine, card, ATMOperations.WITHDRAW_MONEY);
        atmMachine.getState().withdrawMoney(atmMachine, card, 60);
        atmMachine.getState().selectOperationToPerform(atmMachine, card, ATMOperations.CHECK_BALANCE);
        atmMachine.getState().getTotalBalance(atmMachine, card);
        atmMachine.getState().selectOperationToPerform(atmMachine, card, ATMOperations.END_TRANSACTION);
    }
}
