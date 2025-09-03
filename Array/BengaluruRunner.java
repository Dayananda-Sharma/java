class BengaluruRunner{
	public static void main (String [] args){
		System.out.println("             int");
	int [] money = {5000,5500,6000};
	int [] amount = Bengaluru.rent(money);
    for (int number=0; number<amount.length; number++){
    System.out.println(amount[number]);
	
	}
    System.out.println("             String");
    String [] areaname = {"Daya","Sharma"};
	String [] areaid = Bengaluru.area(areaname);

    for (int blocks=0; blocks<areaid.length; blocks++){
    System.out.println(areaid[blocks]);
	}
    System.out.println("             char");
    char [] blockid={'A','B'};
    char [] letter = Bengaluru.block(blockid);

    for (int pass=0; pass<letter.length; pass++){
    System.out.println(letter[pass]);
	}
	System.out.println("             byte");
    byte [] rajaji={78,25,87};
    byte [] nagar = Bengaluru.pincode(rajaji);

    for (int beng=0; beng<nagar.length; beng++){
    System.out.println(nagar[beng]);
	}
    System.out.println("             double");
	double [] paisa={2209909,287600.0776,677655.99};
    double [] job = Bengaluru.salary(paisa);

    for (int total=0; total<job.length; total++){
    System.out.println(job[total]);
	}
    System.out.println("             long");
    long [] list={9222,668889};
    long [] numbers = Bengaluru.numOfAera(list);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={true};
    boolean [] ok = Bengaluru.good(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={165f,119f,5f,389f};
    float [] days = Bengaluru.weekend(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}