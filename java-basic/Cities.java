class Cities{
	public static void main (String [] args ){
		char bengaluru='r';
		char mangaluru='p';
		char davangere='b';
		char chitradurga='h';
		
		char [] city ={bengaluru,mangaluru,davangere,chitradurga};
		System.out.println(city [2] );
		
		char tumkur='S';
		city [2]=tumkur;
        System.out.println(city [2] );
  		 
		System.out.println("cities names");

       for (char area=0; area < city.length; area++)
       System.out.println(city [area] );
	}
}	