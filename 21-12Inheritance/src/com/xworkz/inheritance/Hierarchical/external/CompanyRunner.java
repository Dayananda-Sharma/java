package com.xworkz.inheritance.Hierarchical.external;

import com.xworkz.inheritance.Hierarchical.internal.ITDeveloper;
import com.xworkz.inheritance.Hierarchical.internal.ITManager;
import com.xworkz.inheritance.Hierarchical.internal.ITTester;

public class CompanyRunner {
    public static void main(String[] args) {
        ITDeveloper itDeveloper=new ITDeveloper();
        itDeveloper.displayDeveloper();
        itDeveloper.displayIT();
        ITManager manager=new ITManager();
        manager.displayITManager();
        manager.displayIT();
        ITTester tester=new ITTester();
        tester.displayTester();
        tester.displayIT();
    }
}
