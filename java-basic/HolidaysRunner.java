class HolidaysRunner{
	public static void main(String [] args){ 
	String name=Holidays.diwaliName("diwalidays");
	System.out.println(name);
	int num = Holidays.numOfHoliday(10);
	System.out.println(num);
	char grade=Holidays.diwaliHoliday('T');
	System.out.println(grade);
	long amount=Holidays.weSpent(2000l);
	System.out.println(amount);
	boolean good=Holidays.holiHoliday(true);
	System.out.println(good);
	float rateing=Holidays.rateingHoliday(5f);
	System.out.println(rateing);
	double friends=Holidays.enjoyHoliday(10);
	System.out.println(friends);
	}
}	