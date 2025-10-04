class PhoneNumberRunner{
 public static void main(String [] args){
   
   Application Application =new Application(8776555);
   College College =new College(8776555);
   Bank Bank =new Bank(8776555);
   PhoneNumber PhoneNumber =new PhoneNumber("Prasad",Bank,College,Application);
   PhoneNumber.displayPhoneNumber();
   }
 }  