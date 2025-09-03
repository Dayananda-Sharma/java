class IndiaRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] num = {29};
	int [] states = India.state(num);

    for (int number=0; number<states.length; number++){
    System.out.println(states[number]);
	
	}
    System.out.println("             String");
    String [] three = {"kesari","white","Green"};
	String [] color = India.flag(three);

    for (int flag=0; flag<color.length; flag++){
    System.out.println(color[flag]);
	}
    System.out.println("             char");
    char [] grade={'F','L','A','G'};
    char [] last = India.firstLetter(grade);

    for (int pass=0; pass<last.length; pass++){
    System.out.println(last[pass]);
	}
	System.out.println("             byte");
    byte [] code={7,25,8};
    byte [] all = India.statePincode(code);

    for (int beng=0; beng<all.length; beng++){
    System.out.println(all[beng]);
	}
    System.out.println("             double");
	double [] lists={2209909,287600.0776,677655.99};
    double [] NumOf = India.villages(lists);

    for (int total=0; total<NumOf.length; total++){
    System.out.println(NumOf[total]);
	}
    System.out.println("             long");
    long [] listcode={9222,668889};
    long [] numbers = India.numOfcities(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={true};
    boolean [] ok = India.good(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={1947};
    float [] days = India.independence(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}