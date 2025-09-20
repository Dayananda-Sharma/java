class RoyalStagRunner{
 
  public static void main (String [] args){
	Icecube icecube = new Icecube(4);  
	Water water =new Water(20);  
	Soda soda =new Soda("plan Soda");  
	RoyalStag RoyalStag =new RoyalStag("RoyalStag",1500,icecube,water,soda);  
	RoyalStag.displayRoyalStag();
  
  }
}	