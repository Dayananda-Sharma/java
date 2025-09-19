class Mca{

 public String collegeName;
 public int detalies;
 public McaData mcaData;
 
 public Mca(String collegeName,int detalies, McaData mcaData){
	this.collegeName=collegeName;
	this.detalies=detalies;
	this.mcaData=mcaData;
	
     }
	public void displayMba(){
		
    System.out.println("mcaData="+collegeName+detalies);
    System.out.println("mcaData="+mcaData.batchName);
    System.out.println("mcaData batch="+mcaData.totalTraine);
	
    }

}