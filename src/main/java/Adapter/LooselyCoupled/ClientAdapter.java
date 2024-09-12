package Adapter.LooselyCoupled;

import java.util.Scanner;

public class ClientAdapter {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter bank name");
        String bankAPIName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankAPIName);
        bankAPI.checkBalance();
        bankAPI.transferMoney();

        PhonePe phonePe = new PhonePe();
        phonePe.setBankAPI(bankAPI);
        phonePe.checkLoanEligibility();
    }
}
