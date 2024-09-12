package Adapter.LooselyCoupled;

public class FastTagRecharge {
    boolean recharge(BankAPI bankAPI, int amount){
        if(bankAPI.checkBalance()>=1000){
            System.out.println("FastTag recharged successfully :)");
            return true;
        }
        System.out.println("Not enough sufficient funds for fast tag");
        return false;
    }
}
