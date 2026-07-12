package Structural.Adapter;

import Structural.Adapter.Bank.ICICIBankMethods;

public class ICICIBankAdapter implements BankAPI{
    private final ICICIBankMethods icicibankMethods;

    public ICICIBankAdapter(ICICIBankMethods icicibankMethods) {
        this.icicibankMethods = icicibankMethods;
    }

    @Override
    public String withdrawMoney() {
        return icicibankMethods.ICICIBankWithdraw();
    }

    @Override
    public String depositMoney() {
        return icicibankMethods.ICICIBankDeposit();
    }

    @Override
    public String transferMoney() {
        return icicibankMethods.ICICIBankTransfer();
    }
}
