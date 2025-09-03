class PrimitiveTypes{
	public static void main (String [] args ){
		long daya=77601978;
		long kiran=89715864;
		long meghraj=82964322;
		long harsha=75778891;
		long karthi=78866681;
		
 long [] phoneNumber={ daya,kiran,meghraj,harsha,karthi};
      System.out.println( phoneNumber[4]);
	  
	  long maruthi=67541898;
	  phoneNumber[4]=maruthi;
	  System.out.println(phoneNumber[4]);
	  
	  for (int mobile=0; mobile<phoneNumber.length; mobile++){
		  System.out.println(" Mobile Number ");
		  System.out.println(phoneNumber[mobile]);
	  }
	
	
	
        char letter='L';
		char grade='G';
		char certificate='C';
		char firstLetter='D';
		char lastLetter='A';
  char [] names={letter,grade,certificate,firstLetter,lastLetter};
          System.out.println( names[3]); 
		  
		  char middleLatter='S';
		  names[3]=middleLatter;
		  System.out.println(names[3]);
		   
		for (int marksCard=0;marksCard<names.length;marksCard++){
			 System.out.println("Documents verification"); 
			  System.out.println( names[marksCard]); 
		}
		
		
		
        double marks=650;
		double pincode=577599;
		double num=769279281;
		double laptopPrice=768980;
		double landLineNum=5675677;
  double [] numbers={marks,pincode,num,laptopPrice,landLineNum};
          System.out.println( numbers[2]); 
		  
		  double totalMoney=100998876;
		  numbers[3]=totalMoney;
		  System.out.println(numbers[2]);
		   
		for (int digits=0;digits<numbers.length;digits++){
			 System.out.println("Documents verification"); 
			  System.out.println( numbers[digits]); 
		}
		
		
		
        int movieRateing=9;
		int actorRateing=10;
		int shopRateing=7;
		int collegeRateing=8;
		int mobileRateing=7;
		
    int [] rateing={ movieRateing,actorRateing,shopRateing,collegeRateing,mobileRateing};
      System.out.println( rateing[3]);
	  
	  int luluMall=10;
	  rateing[3]=luluMall;
	  System.out.println(rateing[3]);
	  
	  for (int review=0; review<rateing.length; review++){
		  System.out.println("OVER ALL REVIEW ");
		  System.out.println(rateing[review]);
	  }
	    boolean mallOpenEveryday=true;
		boolean holidysIsGood=false;
		boolean sudeepIsActor=true;
		boolean harshaIsMyfriend=false;
		boolean everyoneIsGood=false;
		
    boolean []society ={ mallOpenEveryday,holidysIsGood,sudeepIsActor,harshaIsMyfriend,everyoneIsGood};
      System.out.println( society[2]);
	  
       boolean viratIsPlayer=true;
	  society[2]=viratIsPlayer;
	  System.out.println(society[2]);
	  
	  for (int everything=0;everything <society.length; everything++){
		  System.out.println(" We Need Particular details ");
		  System.out.println(society[everything]);
	   }
	   
	  
	    float sudeepNumOfMovies=59f;
		float prabhasRateing=10f;
		float areaNum=19f;
		float houseNum=75f;
		float birth=39f;
		
 float [] total={ sudeepNumOfMovies,prabhasRateing,areaNum,houseNum,birth};
      System.out.println( total[4]);
	  
	  float id=8;
	  total[4]=id;
	  System.out.println(total[4]);
	  
	  for (int idNumber=0; idNumber<total.length; idNumber++){
		  System.out.println("Display Every Data ");
		  System.out.println(total[idNumber]);
	  }
	   String name1= "maruthi";
	   String name2= "virat";
	   String name3= "meghraj";
	   String name4= "kiran";
	   
	   String [] legends={name1,name2,name3,name4};
	   System.out.println(legends[2]);
	   
	   String mySelf="Daya";
	   legends[2]=mySelf;
	   System.out.println(legends[2]);
	   
	   for (int heros=0; heros<legends.length; heros++){
		   System.out.println(" show me actors Names");
		   System.out.println(legends[2]);
	   }
}
    
	 
}