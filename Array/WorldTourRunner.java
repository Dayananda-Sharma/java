class WorldTourRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] num = {963542098};
	int [] list = WorldTour.detailes(num);

    for (int number=0; number<list.length; number++){
    System.out.println(list[number]);
	
	}
    System.out.println("             String");
    String [] all = {"everything is good",};
	String [] color = WorldTour.palace(all);

    for (int flag=0; flag<color.length; flag++){
    System.out.println(color[flag]);
	}
    System.out.println("             char");
    char [] grade={'T','R','I','P'};
    char [] last = WorldTour.best(grade);

    for (int run=0; run<last.length; run++){
    System.out.println(last[run]);
	}
	System.out.println("             byte");
    byte [] nice={25,21,23};
    byte [] value = WorldTour.count(nice);

    for (int beng=0; beng<value.length; beng++){
    System.out.println(value[beng]);
	}
    System.out.println("             double");
	double [] lists={959900.900};
    double [] NumOf = WorldTour.numOfPlans(lists);

    for (int total=0; total<NumOf.length; total++){
    System.out.println(NumOf[total]);
	}
    System.out.println("             long");
    long [] listcode={9222,668889,855478987};
    long [] numbers = WorldTour.numOfdays(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={false};
    boolean [] ok = WorldTour.thisIsGood(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={89876f};
    float [] days = WorldTour.outOfCountry(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}