class University{
	public String universityName;
	public int universityDistance; 
	public Akash akash;
	
    public University(String universityName,int universityDistance,Akash akash){
    	this.universityName=universityName;
		this.universityDistance=universityDistance;
		this.akash=akash;
	}
	public void displayUniversity(){
	System.out.println("universityName="+universityName);
    System.out.println("universityDistance="+universityDistance);
	System.out.println("akash="+akash.collegeFee);
	}
}	