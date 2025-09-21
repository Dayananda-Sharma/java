class SignatureRunner{
   
   public static void main (String [] args){
	Glass glass = new Glass(4);  
	Snacks snacks =new Snacks(1000);  
	Cigarettes cigarettes =new Cigarettes("plan Soda");  
	Signature Signature =new Signature("Signature",80000,glass,snacks,cigarettes);  
	Signature.displaySignature();
  
  }
}	