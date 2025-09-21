class BankRunner{
 public static void main(String [] args){
 
    Money Money =new Money(70000);
    PhoneNumber PhoneNumber =new PhoneNumber(9887766);
    UserName UserName =new UserName("Daya");
    IndianBank IndianBank =new IndianBank("IndianBank",477,UserName,PhoneNumber,Money);
	UnionBank UnionBank =new UnionBank("UnionBank",688,UserName,PhoneNumber,Money);
	BankOfBaroda BankOfBaroda =new BankOfBaroda("BankOfBaroda",111,UserName,PhoneNumber,Money);
    IndianBank.displayBankDetalies();
 	UnionBank.displayUnionBankDetalies();
	BankOfBaroda.displayBankOfBarodaDetalies();
	
	
	
	
	}
}	