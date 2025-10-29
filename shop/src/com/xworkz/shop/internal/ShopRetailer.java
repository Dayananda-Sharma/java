package com.xworkz.shop.internal;

public class ShopRetailer {
    String  shopsName;
    String shopsAddress;
    long shopsPhone;
    public ShopRetailer(String shopsName, String shopsAddress, long shopsPhone) {
        this.shopsName = shopsName;
        this.shopsAddress = shopsAddress;
        this.shopsPhone = shopsPhone;
        System.out.println(" shop name: "+shopsName);
        System.out.println(" shops address: "+shopsAddress);
        System.out.println(" shops phone: "+shopsPhone);

    }

}
