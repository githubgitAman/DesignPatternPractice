package Structural.Adapter;

import Structural.Adapter.Bank.YesBankMethods;

public class YesBankAPIAdapter implements BankAPI {
    private final YesBankMethods yesBankMethods;

    public YesBankAPIAdapter(YesBankMethods yesBankMethods) {
        this.yesBankMethods = yesBankMethods;
    }

    @Override
    public String withdrawMoney() {
        return yesBankMethods.yesBankWithdraw();
    }

    @Override
    public String depositMoney() {
        return yesBankMethods.yesBankDeposit();
    }

    @Override
    public String transferMoney() {
        return yesBankMethods.yesBankTransfer();
    }
}
