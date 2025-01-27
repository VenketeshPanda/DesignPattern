package vendingmachine.acceptpayment;

public interface AcceptPaymentStrategy {
    void acceptPayment(int amount);
    void refundAmount();
}
