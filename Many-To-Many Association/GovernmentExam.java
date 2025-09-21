class GovernmentExam{

  public String examName;
   Pancard pancard;
   Dl dl;
   AddharCard addharCard;
	
 public GovernmentExam(String examName,Pancard pancard,Dl dl,AddharCard addharCard){
	this.examName=examName;
    this.pancard=pancard;
    this.dl=dl;
    this.addharCard=addharCard;

 }
	
 public void displayGovernmentExam(){
	 
	System.out.println("Exam Name:"+examName); 
	System.out.println("Name:"+pancard.number); 
	System.out.println("proff:"+dl.proff); 
    System.out.println("verifying OTP :"+addharCard.Otp); 	
    }     	
}