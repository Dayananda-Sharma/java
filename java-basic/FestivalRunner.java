class FestivalRunner{
	public static void main(String [] args){ 
	int Genesha = Festival.days(10);
	System.out.println(Genesha);
	char letter= Festival.letter('L');
	System.out.println(letter);
	double money=Festival.money(10000);
	System.out.println(money);
	long price=Festival.ganeshaPrice(15000l);
	System.out.println(price);
	boolean isEvent = Festival.holiday(true);
	System.out.println(isEvent);
	float happy=Festival.happy(3f);
	System.out.println(happy);
	String name=Festival.festivalName("name");
	System.out.println(name);
	}
}