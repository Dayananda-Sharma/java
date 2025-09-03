class JapanRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] num = {29,67,98,76,43};
	int [] stateslist = Japan.list(num);

    for (int number=0; number<stateslist.length; number++){
    System.out.println(stateslist[number]);
	
	}
    System.out.println("             String");
    String [] three = {"Red","white",};
	String [] color = Japan.flags(three);

    for (int flag=0; flag<color.length; flag++){
    System.out.println(color[flag]);
	}
    System.out.println("             char");
    char [] grade={'F','L','A','G'};
    char [] last = Japan.firstLetter(grade);

    for (int run=0; run<last.length; run++){
    System.out.println(last[run]);
	}
	System.out.println("             byte");
    byte [] code={7,25,8};
    byte [] all = Japan.Pincode(code);

    for (int beng=0; beng<all.length; beng++){
    System.out.println(all[beng]);
	}
    System.out.println("             double");
	double [] lists={2209909,287600.0776,677655.99};
    double [] NumOf = Japan.cities(lists);

    for (int total=0; total<NumOf.length; total++){
    System.out.println(NumOf[total]);
	}
    System.out.println("             long");
    long [] listcode={9222,668889};
    long [] numbers = Japan.numOfPepoles(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={true};
    boolean [] ok = Japan.good(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={2025};
    float [] days = Japan.everything(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}