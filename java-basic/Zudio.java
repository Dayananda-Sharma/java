class Zudio{
	public static void main (String [] args){
	byte shirtPrice=99;
	byte tshirt=88;
	byte shoe=110;
	byte pants=125;
	 
	 byte [] price= {shirtPrice,tshirt,shoe,pants};

	 
	 for ( byte amount=0; amount<price.length; amount++)
			System.out.println( price [(int) amount]);
		
}
}