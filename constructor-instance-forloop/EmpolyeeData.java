class EmpolyeeData{
 public int salary;
 public String companyName;
 
 public EmpolyeeData(int salary,String companyName){
	 
	this.salary=salary;
    this.companyName=companyName;	
 }
 public void EmpolyeeDetalies(){

    System.out.println("salary="+salary);
	System.out.println("company="+companyName);
    }
}