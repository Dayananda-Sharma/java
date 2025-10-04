class Person extends Doctor{
   public String personName;
   public int personAge;
   public long personNumber;
   public boolean personTreatment;
   public double bill;
   public char rateing;
   public float day;
 
  public Person(String personName,int personAge,long personNumber,boolean personTreatment,double bill,char rateing,float day){ 
    super();
	
   this.personName=personName;
   this.personAge=personAge;
   this.personNumber=personNumber;
   this.personTreatment=personTreatment;
   this.bill=bill;
   this.rateing=rateing;
   this.day=day;
  }
  public void displayPerson(){
    System.out.println("personName detalies"+this.personName);
	System.out.println("detalies"+super.doctorName);
	System.out.println("personName detalies"+this.personAge);
	System.out.println("detalies"+super.age);
	System.out.println("personName detalies"+this.personNumber);
	System.out.println("detalies"+super.phoneNumber);
	System.out.println("personName detalies"+this.personTreatment);
	System.out.println("detalies"+super.goodDoctor);
	System.out.println("personName detalies"+this.bill);
	System.out.println("detalies"+super.gst);
	System.out.println("personName detalies"+this.rateing);
	System.out.println("detalies"+super.grade);
	System.out.println("personName detalies"+this.day);
	System.out.println("detalies"+super.date);
  }
}