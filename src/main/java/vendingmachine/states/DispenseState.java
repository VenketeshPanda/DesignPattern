package vendingmachine.states;

import vendingmachine.models.Item;
import vendingmachine.models.VendingMachine;

public class DispenseState implements VendingMachineState{

    public DispenseState(VendingMachine vendingMachine,int code){
        dispenseProduct(vendingMachine,code);
    }

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
        System.out.println("Oops, something went wrong...");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int code) {
        //TODO
        Item item = vendingMachine.getInventory().getProductByCode(code);
        System.out.println("Please collect your item from the dispensing tray...");
        System.out.println(item.getItemType());
        vendingMachine.setVendingMachineState(new IdleState());
    }

    @Override
    public void endTransaction(VendingMachine vendingMachine) {
        System.out.println("Ending Transaction...");
        refundAmount(vendingMachine,0);
    }

    @Override
    public void refundAmount(VendingMachine vendingMachine, int amount) {
        System.out.println("Refunding amount...");
        vendingMachine.removeMoneyFromTransaction();
        vendingMachine.setVendingMachineState(new IdleState());
    }
}
