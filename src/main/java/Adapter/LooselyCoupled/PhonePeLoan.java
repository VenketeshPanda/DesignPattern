package Adapter.LooselyCoupled;

public class PhonePeLoan {
    public boolean loanCheck(BankAPI bankAPI){
        if(bankAPI.checkBalance()>100){
            System.out.println("You are an esteemed member of "+bankAPI.toString()+" you are eligible for loan");
            return true;
        }
        return false;
    }
}
