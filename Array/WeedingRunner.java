class WeedingRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] num = {963542098};
	int [] list = Weeding.detailes(num);

    for (int number=0; number<list.length; number++){
    System.out.println(list[number]);
	
	}
    System.out.println("             String");
    String [] all = {"we Need partner",};
	String [] color = Weeding.palace(all);

    for (int family=0; family<color.length; family++){
    System.out.println(color[family]);
	}
    System.out.println("             char");
    char [] grade={'W','E','E','D','I','N','G'};
    char [] last = Weeding.best(grade);

    for (int run=0; run<last.length; run++){
    System.out.println(last[run]);
	}
	System.out.println("             byte");
    byte [] nice={1,4,3};
    byte [] value = Weeding.count(nice);

    for (int beng=0; beng<value.length; beng++){
    System.out.println(value[beng]);
	}
    System.out.println("             double");
	double [] lists={1100.900};
    double [] good = Weeding.numOfdates(lists);

    for (int total=0; total<good.length; total++){
    System.out.println(good[total]);
	}
    System.out.println("             long");
    long [] listcode={9};
    long [] numbers = Weeding.numOfdays(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={false};
    boolean [] ok = Weeding.thisIsGood(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] numOfTime={9852f};
    float [] days = Weeding.myPlace(numOfTime);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}