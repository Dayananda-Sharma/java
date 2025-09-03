class SciotyRunner{
	public static void main (String [] args){
	System.out.println("             int");
	int [] values = {199,299,599};
	int [] recharge = Scioty.price(values);

    for (int number=0; number<recharge.length; number++){
    System.out.println(recharge[number]);
	
	}
    System.out.println("             String");
    String [] name = {"Daya","Sharma"};
	String [] idNum = Scioty.myName(name);

    for (int reg=0; reg<idNum.length; reg++){
    System.out.println(idNum[reg]);
	}
    System.out.println("             char");
    char [] grade={'A','B'};
    char [] letter = Scioty.certificate(grade);

    for (int pass=0; pass<letter.length; pass++){
    System.out.println(letter[pass]);
	}
	System.out.println("             byte");
    byte [] Studentid={78,25,87};
    byte [] num = Scioty.mobile(Studentid);

    for (int book=0; book<num.length; book++){
    System.out.println(num[book]);
	}
    System.out.println("             double");
	double [] money={2209909,287600.0776,677655.99};
    double [] credit = Scioty.bank(money);

    for (int total=0; total<credit.length; total++){
    System.out.println(credit[total]);
	}
    System.out.println("             long");
    long [] contact={977635626,66778889};
    long [] numbers = Scioty.father(contact);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] player={true};
    boolean [] kholi = Scioty.virat(player);

    for (int hero=0; hero<kholi.length; hero++){
    System.out.println(kholi[hero]);
	}
    System.out.println("             float");
    float [] year={165f,119f,5f,389f};
    float [] days = Scioty.lastDay(year);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}
	}
	}