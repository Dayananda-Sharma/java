class Trainer{
 public String trainerName;
 public int trainerSalary;
 public Trainee traine;
 
 public Trainer(String trainerName,int trainerSalary, Trainee traine){
	this.trainerName=trainerName;
	this.trainerSalary=trainerSalary;
	this.traine=traine;
	
     }
	public void displayTrainer(){
		
    System.out.println("trainerName="+trainerName+trainerSalary);
    System.out.println("trainerSalary="+traine.batchName);
    System.out.println("Traine batch="+traine.totalTraine);
	
    }

}