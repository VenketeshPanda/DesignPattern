package Adapter.LooselyCoupled;

public class PhonePe {

    BankAPI bankAPI = new YesBankAPIAdapter();
    PhonePeLoan phonePeLoan=new PhonePeLoan();
    FastTagRecharge fastTagRecharge=new FastTagRecharge();

    void setBankAPI(BankAPI bankAPI){
        this.bankAPI=bankAPI;
    }

    boolean checkLoanEligibility(){
        return phonePeLoan.loanCheck(bankAPI);
    }

    boolean rechargeFastTag(){
        if(fastTagRecharge.recharge(bankAPI,1500)){
            return true;
        }else{
            throw new RuntimeException("Add more funds");
        }
    }
}
