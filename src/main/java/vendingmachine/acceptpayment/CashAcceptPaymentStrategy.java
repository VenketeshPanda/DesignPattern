package vendingmachine.acceptpayment;

public class CashAcceptPaymentStrategy implements AcceptPaymentStrategy{

    @Override
    public void acceptPayment(int amount) {
        System.out.println("Accepting cash payment of "+amount);
    }

    @Override
    public void refundAmount() {
        System.out.println("Please collect the refund in the refund tray");
    }
}
