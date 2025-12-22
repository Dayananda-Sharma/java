package com.xworkz.inheritance.Hierarchical.external;

import com.xworkz.inheritance.Hierarchical.internal.CurrentAccount;
import com.xworkz.inheritance.Hierarchical.internal.LoanAccount;
import com.xworkz.inheritance.Hierarchical.internal.SavingsAccount;

public class BankSystemRunner {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.displaySavings();
        savingsAccount.displayAccount();
        LoanAccount loanAccount=new LoanAccount();
        loanAccount.displayLoan();
        loanAccount.displayAccount();
        CurrentAccount currentAccount=new CurrentAccount();
        currentAccount.displayCurrent();
        currentAccount.displayAccount();
    }
}
