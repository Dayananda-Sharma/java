class PhoneNumber{
 public String personName;
   public Bank bank;
   public College college;
   public Application application;
   public PhoneNumber(String personName,Bank bank, College college, Application application){
    this.personName=personName;
    this.bank=bank;
    this.college=college;
    this.application=application;
 }	
 public void displayPhoneNumber(){
    System.out.println("personName="+personName);
	System.out.println("bank="+bank.phoneNumber);
	System.out.println("college="+college.phoneNumber);
	System.out.println("application="+application.phoneNumber);
	}
}	