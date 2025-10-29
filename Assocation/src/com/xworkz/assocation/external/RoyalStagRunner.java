package com.xworkz.assocation.external;

import com.xworkz.assocation.internal.Icecube;
import com.xworkz.assocation.internal.RoyalStag;
import com.xworkz.assocation.internal.Soda;
import com.xworkz.assocation.internal.Water;

public class RoyalStagRunner {
    public static void main (String [] args){
        Icecube icecube = new Icecube(4);
        Water water =new Water(20);
        Soda soda =new Soda("plan Soda");
        RoyalStag RoyalStag =new RoyalStag("RoyalStag",1500,icecube,water,soda);
        RoyalStag.displayRoyalStag();

    }

}
