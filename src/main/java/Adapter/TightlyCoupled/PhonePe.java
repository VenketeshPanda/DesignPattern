package Adapter.TightlyCoupled;

public class PhonePe {

    YesBankAPI yesBankAPI=new YesBankAPI();
    PhonePeLoan phonePeLoan=new PhonePeLoan();
    FastTagRecharge fastTagRecharge=new FastTagRecharge();

    boolean checkLoanEligibility(){
        return phonePeLoan.loanCheck(yesBankAPI);
    }

    boolean rechargeFastTag(){
        if(fastTagRecharge.recharge(yesBankAPI,1500)){
            return true;
        }else{
            throw new RuntimeException("Add more funds");
        }
    }
}
