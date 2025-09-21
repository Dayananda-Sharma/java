class BlackAndWhite{
 public String drinkName;
 public int price;
 Sprite sprite;
 Pickle pickle;
 Pub pub;
 
 public BlackAndWhite(String drinkName,int price,Sprite sprite,Pickle pickle,Pub pub){
	this.drinkName=drinkName;
    this.price=price;
    this.sprite=sprite;
    this.pickle=pickle;
    this.pub=pub;
    }

  public void displayBlackAndWhite(){
    System.out.println("drink ="+drinkName);
    System.out.println("cost="+price);
    System.out.println("noOfGlass:"+sprite.noOfGlass);
  	System.out.println("snacks :"+pickle.cost);
    System.out.println("Adda:"+pub.location);
    } 
}	
	