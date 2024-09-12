package Adapter.TightlyCoupled;

public class FastTagRecharge {
    boolean recharge(YesBankAPI yesBankAPI,int amount){
        if(yesBankAPI.getBalance()>=1000){
            System.out.println("FastTag recharged successfully :)");
            return true;
        }
        System.out.println("Not enough sufficient funds for fast tag");
        return false;
    }
}
