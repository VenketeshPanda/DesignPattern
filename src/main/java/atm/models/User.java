package atm.models;

public class User {
    Card card;
    String name;
    BankAccount bankAccount;

    public User(String name,Card card,BankAccount bankAccount){
        this.name=name;
        this.card=card;
        this.bankAccount=bankAccount;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
