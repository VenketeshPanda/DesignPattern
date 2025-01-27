package atm.withdrawmoney;

import atm.models.ATMMachine;

public class OneHundredWithdrawMoneyHandler extends WithdrawMoneyHandler {
    public OneHundredWithdrawMoneyHandler(WithdrawMoneyHandler withdrawMoneyHandler) {
        super(withdrawMoneyHandler);
    }

    @Override
    public void withdrawMoney(ATMMachine atmMachine, int amount) {
        int required = amount / 100;
        int balance = amount % 100;

        if (atmMachine.getNoOf100s() >= required) {
            System.out.println("No of 100s: " + required);
        } else {
            balance += (required * 100);
        }

        if (balance != 0) super.withdrawMoney(atmMachine, balance);
    }
}
