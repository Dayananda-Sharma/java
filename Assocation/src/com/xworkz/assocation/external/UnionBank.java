package com.xworkz.assocation.external;

import com.xworkz.assocation.internal.Money;
import com.xworkz.assocation.internal.PhoneNumber;
import com.xworkz.assocation.internal.UserName;

public class UnionBank {
    public String bankName;
    public int areaPin;
     UserName userName;
    PhoneNumber phoneNumber;
    Money money;

    public UnionBank(String bankName, int areaPin,UserName userName,PhoneNumber phoneNumber,Money money){
        this.bankName=bankName;
        this.areaPin=areaPin;
        this.userName=userName;
        this.phoneNumber=phoneNumber;
        this.money=money;
    }

    public void displayUnionBankDetalies(){

        System.out.println("Bank Name:"+bankName);
        System.out.println("pin Code:"+areaPin);
        System.out.println("Name:"+userName.name);
        System.out.println("PhoneNumber:"+phoneNumber.number);
        System.out.println("Amount :"+money.total);
    }

}
