class OnlineDelivery{
	public static void main (String [] args ){
		short zomzto=1000;
	    short swiggy=2000;
		short blinkit=3000;
		short flipkart=4000;
		short amazon=5000; 
		 
		 short [] distance ={zomzto,swiggy,blinkit,flipkart,amazon};
		 
		 for (short app=0; app<distance.length; app++)
			System.out.println( distance[app]);
	}
}