class RiceBat{
   public int price;
   Oil oil;
   Rice rice;
   Salt salt;
   public RiceBat(int price,Oil oil,Rice rice,Salt salt){
     this.price=price;
	 this.oil=oil;
	 this.rice=rice;
	 this.salt=salt;
	} 
   
   public void displayRiceBat(){ 
    System.out.println("Ricebat:"+price);
	System.out.println("oil:"+oil.price);
	System.out.println("Rice:"+rice.name);
	System.out.println("salt:"+salt.name);
	
	}
}   