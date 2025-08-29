class DestinationRunner{
	public static void main(String [] args){ 
	String name=Destination.palace("Thai Land");
	System.out.println(name);
	
	int distance = Destination.kiloMeter(3000);
	System.out.println(distance);
	
	char palace=Destination.reach('S');
	System.out.println(palace);
	
	long takes=Destination.time(2098);
	System.out.println(takes);
	
	boolean yes=Destination.peace(true);
	System.out.println(yes);
	
	float days=Destination.day(19f);
	System.out.println(days);
	
	double num=Destination.pincode(560011);
	System.out.println(num);
	}
	  
	  
}