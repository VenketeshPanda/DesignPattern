package carrentalsystem.payment;

public class PaymentStrategyFactory {
    public static AcceptPayment getPaymentStrategy(ModeOfPayment modeOfPayment){
        if(modeOfPayment.equals(ModeOfPayment.CASH)){
            return new CashAcceptPayment();
        }
        return new UPIAcceptPayment();
    }
}
