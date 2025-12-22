package com.xworkz.inheritance.Hierarchical.external;

import com.xworkz.inheritance.Hierarchical.internal.Admin;
import com.xworkz.inheritance.Hierarchical.internal.Customer;
import com.xworkz.inheritance.Hierarchical.internal.Seller;

public class UserRunner {
    public static void main(String[] args) {
        Seller seller=new Seller();
        seller.displaySeller();
        seller.displayUser();
        Customer customer=new Customer();
        customer.displayCustomer();
        customer.displayUser();
        Admin admin=new Admin();
        admin.displayAdmin();
        admin.displayUser();
    }
}
