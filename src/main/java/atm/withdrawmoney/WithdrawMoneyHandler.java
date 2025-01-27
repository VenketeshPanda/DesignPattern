package atm.withdrawmoney;

import atm.models.ATMMachine;

public abstract class WithdrawMoneyHandler {

    WithdrawMoneyHandler nextWithdrawMoneyHandler;

    public WithdrawMoneyHandler(WithdrawMoneyHandler withdrawMoneyHandler) {
        this.nextWithdrawMoneyHandler = withdrawMoneyHandler;
    }

    public void withdrawMoney(ATMMachine atmMachine, int amount) {
        if (nextWithdrawMoneyHandler != null) {
            nextWithdrawMoneyHandler.withdrawMoney(atmMachine, amount);
        } else{
            System.out.println("There are not enough notes to support your transaction");
        }
    }
}
