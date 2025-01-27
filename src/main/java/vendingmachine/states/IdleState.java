package vendingmachine.states;

import vendingmachine.models.VendingMachine;

public class IdleState implements VendingMachineState{
    @Override
    public void pressEnterCashButton(VendingMachine vendingMachine) {
        //TODO
        System.out.println("Enter cash button pressed");
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void enterCash(VendingMachine vendingMachine, int amount) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int code) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void endTransaction(VendingMachine vendingMachine) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void refundAmount(VendingMachine vendingMachine, int amount) {
        System.out.println("Oops, something went wrong...");
    }
}
