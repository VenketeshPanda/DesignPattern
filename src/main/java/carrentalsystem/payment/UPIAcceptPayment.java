package carrentalsystem.payment;

import carrentalsystem.models.Bill;

public class UPIAcceptPayment implements AcceptPayment{

    @Override
    public void acceptPayment(int amount, Bill bill) {
        System.out.println("ACCPETED THE UPI PAYMENT OF: "+amount);
    }
}
