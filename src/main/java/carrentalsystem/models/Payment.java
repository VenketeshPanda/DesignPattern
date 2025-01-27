package carrentalsystem.models;

import carrentalsystem.payment.AcceptPayment;
import carrentalsystem.payment.ModeOfPayment;
import carrentalsystem.payment.PaymentStrategyFactory;

public class Payment {
    int amount;
    Bill bill;
    AcceptPayment payment;

    public Payment(Bill bill){
        this.amount= bill.amount;
        this.bill=bill;
        this.payment = PaymentStrategyFactory.getPaymentStrategy(ModeOfPayment.CASH);
    }

    public void payBill(){
        payment.acceptPayment(amount,bill);
    }
}
