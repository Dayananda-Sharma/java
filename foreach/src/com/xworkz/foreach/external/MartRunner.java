package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.MartDto;

import java.util.ArrayList;
import java.util.List;

public class MartRunner {
    public static void main(String[] args) {
        List<MartDto> list=new ArrayList<>();
        MartDto m1  = new MartDto("MegaMart",1998,11.2,560001,"Rajajinagar",2001,10.1,98765111,1,true);
        MartDto m2  = new MartDto("CityMart",2003,12.5,560002,"Malleshwaram",1999,9.8,98765222,2,true);
        MartDto m3  = new MartDto("FreshMart",1995,10.7,560003,"Basaveshwaranagar",2000,11.2,98765333,3,true);
        MartDto m4  = new MartDto("SmartShop",2001,11.9,560004,"Jayanagar",1997,9.4,98765444,4,true);
        MartDto m5  = new MartDto("EasyMart",1997,10.5,560005,"Nagarbhavi",1996,8.7,98765555,5,true);
        MartDto m6  = new MartDto("PrimeStore",2004,12.3,560006,"BTM Layout",2002,11.1,98765666,6,true);
        MartDto m7  = new MartDto("QuickBuy",2000,10.9,560007,"Banashankari",1998,9.6,98765777,7,true);
        MartDto m8  = new MartDto("ValueMart",1999,11.4,560008,"Hebbal",1995,8.9,98765888,8,true);
        MartDto m9  = new MartDto("UrbanMart",2005,12.8,560009,"Yeshwanthpur",2003,10.4,98765999,9,true);
        MartDto m10 = new MartDto("SuperBazaar",1996,9.7,560010,"Whitefield",1994,8.5,98766010,10,true);
        MartDto m11 = new MartDto("HyperStore",2006,13.0,560011,"Indiranagar",2004,11.9,98766111,11,true);
        MartDto m12 = new MartDto("BestBuyMart",1994,9.5,560012,"Koramangala",1993,8.3,98766222,12,true);
        MartDto m13 = new MartDto("ShopEase",2007,12.9,560013,"Marathahalli",2005,11.6,98766333,13,true);
        MartDto m14 = new MartDto("ChoiceMart",1992,8.9,560014,"Kengeri",1991,8.1,98766444,14,true);
        MartDto m15 = new MartDto("GroceryHub",2008,13.2,560015,"Electronic City",2006,12.0,98766555,15,true);
        MartDto m16 = new MartDto("DailyNeedsMart",1993,9.3,560016,"Majestic",1990,7.9,98766666,16,true);
        MartDto m17 = new MartDto("MegaStore",2009,13.4,560017,"Shivajinagar",2007,12.2,98766777,17,true);
        MartDto m18 = new MartDto("StarMart",1989,8.8,560018,"Frazer Town",1988,7.8,98766888,18,true);
        MartDto m19 = new MartDto("SmartMart",2010,13.7,560019,"Kammanahalli",2008,12.4,98766999,19,true);
        MartDto m20 = new MartDto("GoodFoodMart",1991,9.1,560020,"RT Nagar",1989,7.5,98767010,20,true);
        MartDto m21 = new MartDto("FreshChoice",2011,13.9,560021,"Hosur Road",2009,12.5,98767111,21,true);
        MartDto m22 = new MartDto("FamilyMart",1988,8.7,560022,"Peenya",1986,7.2,98767222,22,true);
        MartDto m23 = new MartDto("MetroMart",2012,14.0,560023,"Vijayanagar",2010,12.7,98767333,23,true);
        MartDto m24 = new MartDto("NeighborhoodMart",1990,9.0,560024,"KR Puram",1987,7.6,98767444,24,true);
        MartDto m25 = new MartDto("EliteStore",2013,14.1,560025,"Bellandur",2011,12.9,98767555,25,true);
        MartDto m26 = new MartDto("BudgetMart",1987,8.5,560026,"Hennur",1984,7.0,98767666,26,true);
        MartDto m27 = new MartDto("DailyMart",2014,14.3,560027,"Sarjapur",2012,13.0,98767777,27,true);
        MartDto m28 = new MartDto("GreenMart",1986,8.4,560028,"Brookefield",1983,6.8,98767888,28,true);
        MartDto m29 = new MartDto("UrbanGrocery",2015,14.5,560029,"Bannerghatta",2013,13.3,98767999,29,true);
        MartDto m30 = new MartDto("SmartBuy",1985,8.2,560030,"Ulsoor",1982,6.7,98768010,30,true);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        list.add(m7);
        list.add(m8);
        list.add(m9);
        list.add(m10);
        list.add(m11);
        list.add(m12);
        list.add(m13);
        list.add(m14);
        list.add(m15);
        list.add(m16);
        list.add(m17);
        list.add(m18);
        list.add(m19);
        list.add(m20);
        list.add(m21);
        list.add(m22);
        list.add(m23);
        list.add(m24);
        list.add(m25);
        list.add(m26);
        list.add(m27);
        list.add(m28);
        list.add(m29);
        list.add(m30);
        for (MartDto name: list) {
            System.out.println(name);
        }
        list.forEach(n-> System.out.println(n));


    }
}
