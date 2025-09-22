class HandiBiriyani{
  public String name;
   Oil oil;
   Rice rice;
   Salt salt;
   public HandiBiriyani(String name,Oil oil,Rice rice,Salt salt){
     this.name=name;
	 this.oil=oil;
	 this.rice=rice;
	 this.salt=salt;
	} 
   
   public void displayHandiBiriyani(){ 
    System.out.println("Biriyani:"+name);
	System.out.println("oil:"+oil.price);
	System.out.println("Rice:"+rice.name);
	System.out.println("salt:"+salt.name);
	
	}
}   