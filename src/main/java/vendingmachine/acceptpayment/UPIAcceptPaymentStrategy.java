package vendingmachine.acceptpayment;

public class UPIAcceptPaymentStrategy implements AcceptPaymentStrategy{
    @Override
    public void acceptPayment(int amount) {
        System.out.println("Accepting UPI payment of "+amount);
    }

    @Override
    public void refundAmount() {
        System.out.println("Your refund will be credited in 5-7 business days");
    }
}
