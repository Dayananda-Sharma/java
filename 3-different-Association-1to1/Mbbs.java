class Mbbs{
 public String collegeName;
 public int detalies;
 public MbbsData mbbsData;
 
 public Mbbs(String collegeName,int detalies, MbbsData mbbsData){
	this.collegeName=collegeName;
	this.detalies=detalies;
	this.mbbsData=mbbsData;
	
     }
	public void displayMbbs(){
		
    System.out.println("collegeDetalies="+collegeName+detalies);
    System.out.println("collegeDetalies="+mbbsData.batchName);
    System.out.println("collegeDetalies batch="+mbbsData.totalTraine);
	
    }

}