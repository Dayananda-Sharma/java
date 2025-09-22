class RiceRecipes{
  public static void main (String [] args){
   Salt salt =new Salt("SUN");
   Rice rice =new Rice("BasUmati"); 
   Oil oil =new Oil(300);	
   RiceBat RiceBat =new RiceBat(150,oil,rice,salt);
   RiceBat.displayRiceBat();
   Biriyani Biriyani =new Biriyani("Hoskote Biriyani",oil,rice,salt);
   Biriyani.displayBiriyani();
   HandiBiriyani HandiBiriyani =new HandiBiriyani("veg Biriyani",oil,rice,salt);
   HandiBiriyani.displayHandiBiriyani();
     }
}	 