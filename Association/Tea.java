class Tea{
 public int price;
 public String teaName;
 Sugar sugar;
 public Tea(int price,String teaName,Sugar sugar){
  this.price=price;
  this.teaName=teaName;
  this.sugar=sugar;
 }
 public void displayTea(){
  System.out.println("price:"+price);
  System.out.println("Tea Name:"+teaName);
  System.out.println("Sugar:"+sugar.noOfSpons);
   
   }
 }