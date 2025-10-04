class Sbi{
   public int areaPin;
   public Money money;
   public UserNumber userNumber;
   public UserName userName;
   
   public Sbi(int areaPin,Money money,UserNumber userNumber,UserName userName){
    this.areaPin=areaPin;
    this.money=money;
    this.userNumber=userNumber;
	this.userName=userName;
   }
	public void displaySbi(){
	  System.out.println("areaPin="+areaPin);
  	  System.out.println("Money="+money.totalMoney);
	  System.out.println("PhoneNumber="+userNumber.number);
	  System.out.println("UserName="+userName.name);
	  }
	}  