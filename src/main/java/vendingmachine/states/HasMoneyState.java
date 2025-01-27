package vendingmachine.states;

import vendingmachine.models.VendingMachine;

public class HasMoneyState implements VendingMachineState{
    @Override
    public void pressEnterCashButton(VendingMachine vendingMachine) {
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void enterCash(VendingMachine vendingMachine, int amount) {
        //TODO
        System.out.println("Adding your money via your preferred mode of payment...");
        vendingMachine.addMoneyToTransaction(amount);
    }

    @Override
    public void pressSelectProductButton(VendingMachine vendingMachine) {
        System.out.println("You may go ahead and select the product....");
        vendingMachine.setVendingMachineState(new SelectionState());
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
        System.out.println("Ending Transaction...");
        refundAmount(vendingMachine, 0);
    }

    @Override
    public void refundAmount(VendingMachine vendingMachine, int amount) {
        System.out.println("Refunding amount...");
        vendingMachine.removeMoneyFromTransaction();
        vendingMachine.setVendingMachineState(new IdleState());
    }
}
