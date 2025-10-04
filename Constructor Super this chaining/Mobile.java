class Mobile extends Vivo {
 public String mobileName;
 public int price;
 public double gst;
 
 public Mobile(String mobileName,int price,double gst){
	super(); 
   this.mobileName=mobileName;
   this.price=price;
   this.gst=gst;
   
   super.mobileName=mobileName;
   super.price=price;
   super.gst=gst;
 }
   
   public void displayMobile(){
   System.out.println("mobileName="+this.mobileName);
   System.out.println("mobileName="+super.mobileName);
   System.out.println("price="+this.price);
   System.out.println("price="+super.price);
   System.out.println("gst="+this.gst);
   System.out.println("gst="+super.gst);
   }
 }  