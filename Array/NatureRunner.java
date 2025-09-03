class NatureRunner{
  public static void main (String [] args){
	System.out.println("             int");
	int [] num = {291189143};
	int [] list = Nature.detailes(num);

    for (int number=0; number<list.length; number++){
    System.out.println(list[number]);
	
	}
    System.out.println("             String");
    String [] all = {"Green Colors",};
	String [] color = Nature.tree(all);

    for (int flag=0; flag<color.length; flag++){
    System.out.println(color[flag]);
	}
    System.out.println("             char");
    char [] grade={'G','O','O','D'};
    char [] last = Nature.godGift(grade);

    for (int run=0; run<last.length; run++){
    System.out.println(last[run]);
	}
	System.out.println("             byte");
    byte [] best={79,2,11};
    byte [] value = Nature.count(best);

    for (int beng=0; beng<value.length; beng++){
    System.out.println(value[beng]);
	}
    System.out.println("             double");
	double [] lists={229900.900};
    double [] NumOf = Nature.numOfPlants(lists);

    for (int total=0; total<NumOf.length; total++){
    System.out.println(NumOf[total]);
	}
    System.out.println("             long");
    long [] listcode={9222,668889,855478987};
    long [] numbers = Nature.numOfYear(listcode);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] fine={true};
    boolean [] ok = Nature.natureIsGood(fine);

    for (int wow=0; wow<ok.length; wow++){
    System.out.println(ok[wow]);
	}
    System.out.println("             float");
    float [] year={89876f};
    float [] days = Nature.forest(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}