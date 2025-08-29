class VegtablesRunner{
	public static void main(String [] args){ 
	String name=Vegtables.vegtableName("name");
	System.out.println(name);
	int vegName = Vegtables.vegtablePrice(10);
	System.out.println(vegName);
	char grade=Vegtables.vegtableGrade('T');
	System.out.println(grade);
	long amount=Vegtables.vegtableMarket(20000l);
	System.out.println(amount);
	boolean good=Vegtables.vegGood(true);
	System.out.println(good);
	float rateing=Vegtables.rateing(5f);
	System.out.println(rateing);
	double pincode=Vegtables.marketingPincode(577501);
	System.out.println(pincode);
	}
}	