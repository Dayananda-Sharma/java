class SuperMarketRunner{
public static void main (String [] args){
	System.out.println("             int");
	int [] values = {1,3,5,7,8,9,2,9,3,2,1,};
	int [] iteam = SuperMarket.iteams(values);

    for (int number=0; number<iteam.length; number++){
    System.out.println(iteam[number]);
	
	}
    System.out.println("             String");
    String [] names = {"Kiran","Meghu"};
	String [] student = SuperMarket.Studentname(names);

    for (int name=0; name<student.length; name++){
    System.out.println(student[name]);
	}
    System.out.println("             char");
    char [] grades={'A'};
    char [] letter = SuperMarket.grade(grades);

    for (int name=0; name<letter.length; name++){
    System.out.println(letter[name]);
	}
    System.out.println("             byte");
    byte [] id={78,25,87};
    byte [] bookNum = SuperMarket.id(id);

    for (int book=0; book<bookNum.length; book++){
    System.out.println(bookNum[book]);
	}
    System.out.println("             double");
	double [] amount={220.09,2876.0776,67.99};
    double [] credit = SuperMarket.totalAmount(amount);

    for (int total=0; total<credit.length; total++){
    System.out.println(credit[total]);
	}
    System.out.println("             long");  
    long [] contacts={977635626,66778889};
    long [] numbers = SuperMarket.number(contacts);

    for (int total=0; total<numbers.length; total++){
    System.out.println(numbers[total]);
	}
    
	System.out.println("             boolean");
	boolean [] kiccha={true};
    boolean [] sudeep = SuperMarket.actor(kiccha);

    for (int hero=0; hero<sudeep.length; hero++){
    System.out.println(sudeep[hero]);
	}
    System.out.println("             float");
    float [] week={1f,11f,5f,89f};
    float [] days = SuperMarket.day(week);

    for (int month=0; month<days.length; month++){
    System.out.println(days[month]);
	}




















}
}
	