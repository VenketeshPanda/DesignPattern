package Adapter.LooselyCoupled;

public class YesBankAPI {
    public int getBalance(){
        return 100;
    }

    public void transferMoney(int amount){
        System.out.println("Money transferred successfully via Yes Bank: "+amount);
    }
}
