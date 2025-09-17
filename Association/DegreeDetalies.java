class DegreeDetalies{
 public String name;
 public Bca bca;
 
 public DegreeDetalies(Bca bca){
	 
	this.name=bca.name;
    this.bca=bca;
	
 }
 
 public void displayBca(){
	 
	System.out.println(name);
 }
} 