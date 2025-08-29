class Pincode{
	public static void main(String [] args ){
		int hiriyur=577599;
		int durga=577501;
		int davangere=577001;
		int holalkere=577526;
		
		int [] pincodes={hiriyur,durga,davangere,holalkere};
		System.out.println(pincodes [2] );
		 
		 int sira=572137;
		 pincodes [2]=sira;
		 System.out.println(pincodes [2] );
		 
		 System.out.println("Some areas of pincodes");
		 
		 for (int areas=0; areas < pincodes.length; areas++)
			 System.out.println(pincodes [areas] );
	}
}