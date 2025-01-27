package atm.withdrawmoney;

import atm.models.ATMMachine;

public class FiveHundredWithdrawMoneyHandler extends WithdrawMoneyHandler {
    public FiveHundredWithdrawMoneyHandler(WithdrawMoneyHandler withdrawMoneyHandler) {
        super(withdrawMoneyHandler);
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, int amount) {
        int required = amount / 500;
        int balance = amount % 500;

        if (atmMachine.getNoOf500s() >= required) {
            System.out.println("No of 500s: " + required);
            atmMachine.reduceNoOf500s(required);
        } else {
            balance += (required * 500);
        }

        if (balance != 0) super.withdrawMoney(atmMachine, balance);
    }
}
