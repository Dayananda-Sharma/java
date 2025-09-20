class Signature{
 public String drinkName;
 public int price;
 Glass glass;
 Snacks snacks;
 Cigarettes cigarettes;
 
 public Signature(String drinkName,int price,Glass glass,Snacks snacks,Cigarettes cigarettes){
	this.drinkName=drinkName;
    this.price=price;
    this.glass=glass;
    this.snacks=snacks;
    this.cigarettes=cigarettes;
    }

  public void displaySignature(){
    System.out.println("drink ="+drinkName);
    System.out.println("cost="+price);
    System.out.println("noOfGlass:"+glass.noOfGlass);
  	System.out.println("snacks price:"+snacks.cost);
    System.out.println("Soda name:"+cigarettes.cigarettesName);
    } 
}	