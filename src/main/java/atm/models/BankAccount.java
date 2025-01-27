package atm.models;

public class BankAccount {
    int totalBalance;

    public BankAccount(int totalBalance){
        this.totalBalance = totalBalance;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void withdrawMoney(int amount){
        this.totalBalance-=amount;
    }

}
