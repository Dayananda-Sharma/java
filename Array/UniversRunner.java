class UniversRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] num = {2911,6711,3498,2076,143};
	int [] countrylist = Univers.list(num);

    for (int number=0; number<countrylist.length; number++){
    System.out.println(countrylist[number]);
	
	}
    System.out.println("             String");
    String [] three = {"All","colors",};
	String [] color = Univers.flags(three);

    for (int flag=0; flag<color.length; flag++){
    System.out.println(color[flag]);
	}
    System.out.println("             char");
    char [] grade={'G','O','O','D'};
    char [] last = Univers.Letter(grade);

    for (int run=0; run<last.length; run++){
    System.out.println(last[run]);
	}
	System.out.println("             byte");
    byte [] code={79,2,11};
    byte [] all = Univers.income(code);

    for (int beng=0; beng<all.length; beng++){
    System.out.println(all[beng]);
	}
    System.out.println("             double");
	double [] lists={229900.900};
    double [] NumOf = Univers.numOfJob(lists);

    for (int total=0; total<NumOf.length; total++){
    System.out.println(NumOf[total]);
	}
    System.out.println("             long");
    long [] listcode={9222,668889,855478987};
    long [] numbers = Univers.numOfCountry(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={true};
    boolean [] ok = Univers.nature(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={89876f};
    float [] days = Univers.data(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}