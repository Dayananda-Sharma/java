class Lenskart{
 public String shopName;
 public int areaPin;
   Shop shop;
   public Lenskart(String shopName,int areaPin,Shop shop){
    this.shopName=shopName;
	this.areaPin=areaPin;
	this.shop=shop;
	}
  public void displayLenskart(){
  System.out.println("shopName:"+shopName);
  System.out.println("areaPin:"+areaPin);
  System.out.println("shop Address:"+shop.shopAddress);
   }
 }  