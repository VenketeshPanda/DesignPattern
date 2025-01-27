package carrentalsystem.payment;

import carrentalsystem.models.Bill;

public class CashAcceptPayment implements AcceptPayment {
    @Override
    public void acceptPayment(int amount, Bill bill) {
        System.out.println("ACCPETED THE Cash PAYMENT OF: "+amount);
    }
}
