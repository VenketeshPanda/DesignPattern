package atm.state;

import atm.models.ATMMachine;
import atm.models.Card;
import atm.withdrawmoney.FiveHundredWithdrawMoneyHandler;
import atm.withdrawmoney.OneHundredWithdrawMoneyHandler;
import atm.withdrawmoney.TwoThousandWithdrawMoneyHandler;
import atm.withdrawmoney.WithdrawMoneyHandler;

public class WithdrawMoneyState implements State {
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
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void getTotalBalance(ATMMachine atmMachine, Card card) {
        System.out.println("Oops, not allowed now...");
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, Card card, int amount) {
        //TODO
        if (atmMachine.getTotalBalance() < amount) {
            System.out.println("INSUFFICIENT BALANCE IN THE ATM");
            atmMachine.setState(new SelectionState());

        } else if (card.getBankAccount().getTotalBalance() < amount) {
            System.out.println("INSUFFICIENT BALANCE IN THE ACCOUNT");
            atmMachine.setState(new SelectionState());
        } else {
            System.out.println("Withdrawing money....");
            atmMachine.withdrawAmount(amount);
            card.getBankAccount().withdrawMoney(amount);
            WithdrawMoneyHandler withdrawMoneyHandler = new TwoThousandWithdrawMoneyHandler(new FiveHundredWithdrawMoneyHandler(new OneHundredWithdrawMoneyHandler(null)));
            withdrawMoneyHandler.withdrawMoney(atmMachine, amount);
            atmMachine.setState(new SelectionState());
        }
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
