class EMI{
   public String emiName;
   Pancard pancard;
   Dl dl;
   AddharCard addharCard;
	
  public EMI(String emiName,Pancard pancard,Dl dl,AddharCard addharCard){
	this.emiName=emiName;
    this.pancard=pancard;
    this.dl=dl;
    this.addharCard=addharCard;

 }
	
  public void displayEMIDetalies(){
	 
	System.out.println("EMI Name:"+emiName); 
	System.out.println("Name:"+pancard.number); 
	System.out.println("proff:"+dl.proff); 
    System.out.println("verifying OTP :"+addharCard.Otp); 	
    }     	
}