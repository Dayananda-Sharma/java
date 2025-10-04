class India extends Country{
  public String countryName;
  public int countryId;
  public char countrygrade;
  public long countryIncome;
  public boolean goodCountry;
  public double dayincome;
  public float pepoles;
  
  
  public India(String countryName,int countryId,char countrygrade,long countryIncome,boolean goodCountry,double dayincome,float pepoles){
    super();
    this.countryName=countryName;
	this.countryId=countryId;
	this.countrygrade=countrygrade;
	this.countryIncome=countryIncome;
	this.goodCountry=goodCountry;
	this.dayincome=dayincome;
	this.pepoles=pepoles;
	
	super.countryName=countryName;
	super.countryId=countryId;
	super.countrygrade=countrygrade;
	super.countryIncome=countryIncome;
	super.goodCountry=goodCountry;
	super.dayincome=dayincome;
	super.pepoles=pepoles;
	
	}
	
 public void displayIndia(){
   System.out.println("About India"+this.countryName);
   System.out.println("About Country"+super.countryName);
   System.out.println("About India"+this.countryId);
   System.out.println("About Country"+super.countryId);
   System.out.println("About India"+this.countrygrade);
   System.out.println("About Country"+super.countrygrade);
   System.out.println("About India"+this.countryIncome);
   System.out.println("About Country"+super.countrygrade);
   System.out.println("About India"+this.goodCountry);
   System.out.println("About Country"+super.goodCountry);
   System.out.println("About India"+this.dayincome);
   System.out.println("About Country"+super.dayincome);
   System.out.println("About India"+this.pepoles);
   System.out.println("About Country"+super.pepoles);
    }
  }
 
