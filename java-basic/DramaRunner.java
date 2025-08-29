class DramaRunner{
	public static void main(String [] args){ 
	String name=Drama.dramaName("Tom & jerry");
	System.out.println(name);
	int num = Drama.acting(17);
	System.out.println(num);
	char accept=Drama.certified('U');
	System.out.println(accept);
	long amount=Drama.dramaInCome(55098876l);
	System.out.println(amount);
	boolean yes=Drama.isGood(true);
	System.out.println(yes);
	float rateing=Drama.rateing(11f);
	System.out.println(rateing);
	double income=Drama.yearlyIncome(1000000);
	System.out.println(income);
	}
	  
	  
}