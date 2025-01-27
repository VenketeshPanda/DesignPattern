package vendingmachine.acceptpayment;

public class AcceptPaymentFactory {
    public static AcceptPaymentStrategy getAcceptPaymentStrategy(AcceptPaymentType acceptPaymentType) {
        if (acceptPaymentType.equals(AcceptPaymentType.UPI)) {
            return new UPIAcceptPaymentStrategy();
        } else if (acceptPaymentType.equals(AcceptPaymentType.CASH)) {
            return new CashAcceptPaymentStrategy();
        } else return null;
    }
}
