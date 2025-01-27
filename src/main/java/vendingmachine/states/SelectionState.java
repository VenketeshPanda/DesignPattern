package vendingmachine.states;

import vendingmachine.models.Item;
import vendingmachine.models.VendingMachine;

public class SelectionState implements VendingMachineState {
    @Override
    public void pressEnterCashButton(VendingMachine vendingMachine) {
        System.out.println("Oops, something went wrong...");
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
        //TODO
        System.out.println("Selecting product with code: " + code);
        Item item = vendingMachine.getInventory().getProductByCode(code);
        if (item.getPrice() < vendingMachine.getLastTransaction()) {
            refundAmount(vendingMachine, item.getPrice() - vendingMachine.getLastTransaction());
        } else if (item.getPrice() > vendingMachine.getLastTransaction()) {
            System.out.println("NOT ENOUGH MONEY...");
            endTransaction(vendingMachine);
        }
        vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, code));
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
        if (amount == 0) {
            vendingMachine.removeMoneyFromTransaction();
            vendingMachine.setVendingMachineState(new IdleState());
        } else {
            vendingMachine.refundChangeAmount(amount);
        }
    }
}
