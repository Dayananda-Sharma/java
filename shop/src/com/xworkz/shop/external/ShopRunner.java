package com.xworkz.shop.external;


import com.xworkz.shop.bridge.*;
import com.xworkz.shop.internal.*;

public class ShopRunner {
    public static void main(String[] args) {
        ShopsInfo shopsInfo=new ShopsInfo("rudhra","good shop this area",45);
        ShopsInterface shopsInterface=new ShopsImp();
        int noOfShops=shopsInterface.noOfShops(shopsInfo);
        System.out.println(noOfShops);

        ShopRetailer shopsRetailer=new ShopRetailer("raja","good shop this area",454909876);
        ShopsRetilerinter shopsRetilerinter=new ShopsRetilerimp();
        boolean pricelist= shopsRetilerinter.isactive(shopsRetailer);
        System.out.println(pricelist);

        ShopWholSeller shopsWholSeller=new ShopWholSeller("gani",12.1,13);
        ShopsWholSellerinter shopsWholSellerinter=new ShopsWholeSellerInmp();
        //double result= shopsWholSellerinter.pricelist(shopsWholSeller);
     //   System.out.println(result);

        ShopGoodWill shopsGoodWill=new ShopGoodWill("harsh","this shop is good reginable price",12f,'a');
        ShopsgoodWillIInter shopsgoodWilllInter=new ShopsgoodWillImpl();
        float pricelists= shopsgoodWilllInter.pricelist(shopsGoodWill);
        System.out.println(pricelists);

        ShopsStock shopsStock=new ShopsStock(12,"shankar",123f);
        ShopsStockInter shopsStockInter=new ShopsStockimp();
        long store= shopsStockInter.getId(shopsStock);
        System.out.println(store);


    }

}
