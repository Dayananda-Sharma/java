class Boost{
 public int price;
 public String boostName;
 Sugar sugar;
 
 public Boost(int price,String boostName,Sugar sugar){
  this.price=price;
  this.boostName=boostName;
  this.sugar=sugar;
  }
 public void displayBoost(){
  System.out.println("price:"+price);
  System.out.println("Tea Name:"+boostName);
  System.out.println("Sugar:"+sugar.noOfSpons);
   
   }
 }