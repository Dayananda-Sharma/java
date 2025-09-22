class Coffe{
 public int price;
 public String coffeName;
 Sugar sugar;
 
 public Coffe(int price,String coffeName,Sugar sugar){
  this.price=price;
  this.coffeName=coffeName;
  this.sugar=sugar;
  }
 public void displayCoffe(){
  System.out.println("price:"+price);
  System.out.println("Tea Name:"+coffeName);
  System.out.println("Sugar:"+sugar.noOfSpons);
   
   }
 }