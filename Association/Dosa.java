class Dosa{
 public String name;
 public Sambar sambar;
 
 public Dosa(Sambar sambar){
	 
	this.name=sambar.name;
    this.sambar=sambar;

 }
 public void displayName(){
	 
	System.out.println(name); 
	System.out.println("sambar="+sambar.name);
	 
	
}
} 
 