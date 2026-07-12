package Structural.Adapter;

import Structural.Adapter.Bank.ICICIBankMethods;
import Structural.Adapter.Bank.YesBankMethods;

public class Client {
    public static void main(String[] args) {
//        YesBankMethods yesBankMethods = new YesBankMethods();
        ICICIBankMethods iciciBankMethods = new ICICIBankMethods();
        BankAPI bankAPIObject = new ICICIBankAdapter(iciciBankMethods);
        System.out.println(bankAPIObject.withdrawMoney());
        System.out.println(bankAPIObject.depositMoney());
        System.out.println(bankAPIObject.transferMoney());

    }
}
