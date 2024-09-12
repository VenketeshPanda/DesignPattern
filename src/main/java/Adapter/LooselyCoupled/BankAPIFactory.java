package Adapter.LooselyCoupled;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankAPIName){
        if(bankAPIName.equals("YesBank")){
            return new YesBankAPIAdapter();
        }else if(bankAPIName.equals("ICICI")){
            return new ICICIBankAPIAdapter();
        }
        else{
            throw new RuntimeException("Your bank is not available currently");
        }
    }
}
