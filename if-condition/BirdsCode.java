class BirdsCode{
	public static int code(int birds){
	
		int stateBirds=0;
		
		if (birds==1){
		stateBirds=11;
		}
		if (birds==2){
		stateBirds=2;
		}
		if (birds==3){
		stateBirds=11;
		}
		if (birds==4){
		stateBirds=12;
		}
		if (birds==5){
		stateBirds=11;
		}
		if (birds==6){
		stateBirds=17;
		}
		if (birds==8){
		stateBirds=19;
		}
		if (birds==9){
		stateBirds=21;
		}
		if (birds==10){
		stateBirds=311;
		}
		if (birds==11){
		stateBirds=111;
		}
		
		return stateBirds;	
    }
}