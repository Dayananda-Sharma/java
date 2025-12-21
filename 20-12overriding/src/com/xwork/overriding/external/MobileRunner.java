package com.xwork.overriding.external;

import com.xwork.overriding.internal.Electronic;
import com.xwork.overriding.internal.Mobile;


public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile=new Electronic();
        mobile.dipalayMobile();
        mobile.dipalayMobile1();
        mobile.dipalayMobile2();
        mobile.dipalayMobile3();
        mobile.dipalayMobile4();
    }
}
