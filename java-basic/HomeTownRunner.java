class HomeTownRunner{
	public static void main(String [] args){ 
	String name=HomeTown.townName("Hiriyur");
	System.out.println(name);
	int num = HomeTown.numOfHoliday(10);
	System.out.println(num);
	char letter=HomeTown.townLetter('T');
	System.out.println(letter);
	long days=HomeTown.weSpent(2l);
	System.out.println(days);
	boolean good=HomeTown.peace(true);
	System.out.println(good);
	float rateing=HomeTown.rateingTown(5f);
	System.out.println(rateing);
	double pincode=HomeTown.pincode(577501);
	System.out.println(pincode);
	}
}	