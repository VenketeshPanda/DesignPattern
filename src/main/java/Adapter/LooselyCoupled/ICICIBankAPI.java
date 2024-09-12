package Adapter.LooselyCoupled;

public class ICICIBankAPI {
    int getBalance(){
        System.out.println("Balance is: 1000");
        return 1000;
    }

    void transactMoney(){
        System.out.println("Transaction of 10000 successful via ICICI paythru :) ");
    }
}
