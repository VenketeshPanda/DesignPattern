package Adapter.LooselyCoupled;

public class ICICIBankAPIAdapter implements BankAPI{
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.getBalance();
    }

    @Override
    public void transferMoney() {
        iciciBankAPI.transactMoney();
    }
}
