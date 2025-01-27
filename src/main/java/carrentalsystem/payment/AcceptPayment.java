package carrentalsystem.payment;

import carrentalsystem.models.Bill;

public interface AcceptPayment {
    void acceptPayment(int amount, Bill bill);
}
