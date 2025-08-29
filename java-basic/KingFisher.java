class KingFisher{
	public static void main (String [] args){
		long kingFisherStrong=180l;
		long ultra=220l;
		long ultraMax=250l;
		long premium=280l;
		long megnumStrong=300l;
		long [] brands = {kingFisherStrong, ultra, ultraMax, premium, megnumStrong};
		System.out.println(brands[1] );
		
		long londonPilsner=300l;
		brands [1]=londonPilsner;
		System.out.println(brands [1] );
		
		System.out.println("Some Amount list of brands");
	
		for(long amount=0; amount<brands.length; amount++)
	    System.out.println(brands [(int) amount] );
	}
}
		