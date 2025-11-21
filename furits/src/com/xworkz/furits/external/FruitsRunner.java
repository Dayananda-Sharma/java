package com.xworkz.furits.external;

import com.xworkz.furits.bridge.*;

public class FruitsRunner {
    public static void main(String[] args) {
        Fruits fruits=(A,B)->A+B;
       int result= fruits.fruitsPrice(120,150);
        System.out.println(result);

        Sub sub=(C,D)->C-D;
        int no=sub.totalFruits(30,25);
        System.out.println(no);

        Multiple multiple=(Daya,Charles)->(Daya*Charles);
        long shop=multiple.shopPrice(10000,20000);
        System.out.println(shop);

        Division division =(fruitPrice, shopGst) -> fruitPrice/shopGst;
        double gst=division.gst(2000,3000);
        System.out.println(gst);

        Circle circle=(r)->3.14*r;
        double res=circle.Calculate(8);
        System.out.println(res);

        Sub1 sub1=(E,F)->E+F;
        int total=sub1.noFruits(33,22);
        System.out.println(total);

        Add add=(Y,Z)->(Y+Z);
        int number=add.fruitsId(22,33);
        System.out.println(number);

     Div div =(fruitPrice, shopGst) -> fruitPrice/shopGst;
     double ok=div.totalGst(2000,3000);
     System.out.println(ok);

     Multi multi=(Daya,Charles)->(Daya*Charles);
     long sho=multi.shopDetalies(10000,20000);
     System.out.println(sho);

     Cir cir=(r)->3.14*r;
     double resu=cir.Cal(8);
     System.out.println(resu);

    }

}
