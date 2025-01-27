package vendingmachine;

import vendingmachine.models.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("<<WELCOME TO VENDING MACHINE>>");
        vendingMachine.getVendingMachineState().pressEnterCashButton(vendingMachine);
        vendingMachine.getVendingMachineState().enterCash(vendingMachine,11);
        vendingMachine.getVendingMachineState().pressSelectProductButton(vendingMachine);
        vendingMachine.getVendingMachineState().selectProduct(vendingMachine,101);
    }
}
