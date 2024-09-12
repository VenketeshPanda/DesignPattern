package Adapter.TightlyCoupled;

public class PhonePeLoan {
    public boolean loanCheck(YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance()>100)return true;
        return false;
    }
}
