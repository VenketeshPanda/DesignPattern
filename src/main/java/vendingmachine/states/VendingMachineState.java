package vendingmachine.states;

import vendingmachine.models.VendingMachine;

public interface VendingMachineState {
    void pressEnterCashButton(VendingMachine vendingMachine);
    void enterCash(VendingMachine vendingMachine,int amount);
    void pressSelectProductButton(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine,int code);
    void dispenseProduct(VendingMachine vendingMachine,int code);
    void endTransaction(VendingMachine vendingMachine);
    void refundAmount(VendingMachine vendingMachine, int amount);
}
