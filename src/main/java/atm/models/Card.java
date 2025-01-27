package atm.models;

public class Card{
    BankAccount bankAccount;
    static int PIN = 1221;
    int cvv;

    public Card(BankAccount bankAccount){
        this.bankAccount = bankAccount;
        this.cvv = 123;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static int getPIN() {
        return PIN;
    }

    public static void setPIN(int PIN) {
        Card.PIN = PIN;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public boolean validatePIN(int pinToBeChecked){
        return (PIN == pinToBeChecked);
    }
}
