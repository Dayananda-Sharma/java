class Mba{
 
 public String collegeName;
 public int detalies;
 public CollegeDetalies collegeDetalies;
 
 public Mba(String collegeName,int detalies, CollegeDetalies collegeDetalies){
	this.collegeName=collegeName;
	this.detalies=detalies;
	this.collegeDetalies=collegeDetalies;
	
     }
	public void displayMba(){
		
    System.out.println("collegeDetalies="+collegeName+detalies);
    System.out.println("collegeDetalies="+collegeDetalies.batchName);
    System.out.println("collegeDetalies batch="+collegeDetalies.totalTraine);
	
    }

}