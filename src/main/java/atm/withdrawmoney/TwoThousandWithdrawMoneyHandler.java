package atm.withdrawmoney;

import atm.models.ATMMachine;

public class TwoThousandWithdrawMoneyHandler extends WithdrawMoneyHandler {
    public TwoThousandWithdrawMoneyHandler(WithdrawMoneyHandler withdrawMoneyHandler) {
        super(withdrawMoneyHandler);
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, int amount) {
        int required = amount / 2000;
        int balance = amount % 2000;

        if (atmMachine.getNoOf2000s() >= required) {
            System.out.println("No of 2000s: " + required);
            atmMachine.reduceNoOf2000s(required);
        } else {
            balance += (required * 2000);
        }
        if (balance != 0) super.withdrawMoney(atmMachine, balance);
    }
}
