package vendingmachine.models;

import vendingmachine.acceptpayment.AcceptPaymentFactory;
import vendingmachine.acceptpayment.AcceptPaymentStrategy;
import vendingmachine.acceptpayment.AcceptPaymentType;
import vendingmachine.states.IdleState;
import vendingmachine.states.VendingMachineState;

import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    Inventory inventory;
    VendingMachineState vendingMachineState;
    List<Integer> transactions;
    AcceptPaymentStrategy acceptPaymentStrategy;

    public VendingMachine(){
        this.inventory = new Inventory();
        this.vendingMachineState = new IdleState();
        transactions = new LinkedList<>();
        this.acceptPaymentStrategy = AcceptPaymentFactory.getAcceptPaymentStrategy(AcceptPaymentType.UPI);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Integer> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Integer> transactions) {
        this.transactions = transactions;
    }

    public void addMoneyToTransaction(int amount){
        acceptPaymentStrategy.acceptPayment(amount);
        this.transactions.add(amount);
    }

    public void removeMoneyFromTransaction(){
        acceptPaymentStrategy.refundAmount();
        this.transactions.remove(transactions.size()-1);
    }

    public void refundChangeAmount(int amount){
        int changeAmount = transactions.get(transactions.size()-1)-amount;
        System.out.println("Refunding change amount of..."+changeAmount);
        acceptPaymentStrategy.refundAmount();
    }

    public int getLastTransaction(){
        return this.transactions.get(this.transactions.size()-1);
    }
}
