class BankLoan{
   public String loan;
   Pancard pancard;
   Dl dl;
   AddharCard addharCard;
	
 public BankLoan(String loan,Pancard pancard,Dl dl,AddharCard addharCard){
	this.loan=loan;
    this.pancard=pancard;
    this.dl=dl;
    this.addharCard=addharCard;

 }
	
 public void displayBankLoanDetalies(){
	 
	System.out.println("loan Name:"+loan); 
	System.out.println("Name:"+pancard.number); 
	System.out.println("proff:"+dl.proff); 
    System.out.println("verifying OTP :"+addharCard.Otp); 	
    }     	
}