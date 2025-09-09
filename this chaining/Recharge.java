class Recharge{
  public Recharge(){
	 this(200); 
  }
  public Recharge(int amount){
	  this(2000,"jio");
  }
 public Recharge(int amount,String name){
	this(2000,"jio",365);  
 }
  public Recharge(int amount,String name,long years){
	  this(2000,"jio",365,12f);  
  }
  public Recharge(int amount,String name,long years,float lastDate){
     	  this(2000,"jio",365,12f,'R');  
  }
  public Recharge(int amount,String name,long years,float lastDate,char letter){
         this(2000,"jio",365,12f,'R',2.5);  
  } 
    public Recharge(int amount,String name,long years,float lastDate,char letter,double dailydata ){
                 this(2000,"jio",365,12f,'R',2.5,true);  
				 
	}
  public Recharge(int amount,String name,long years,float lastDate,char letter,double dailydata,boolean good ){
	System.out.println(amount);
	System.out.println(name);
    System.out.println(years);
    System.out.println(lastDate);
	System.out.println(letter);
	System.out.println(dailydata);
	System.out.println(good);
    }
}