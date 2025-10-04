class Dog extends Animal{
  public String animalName;
  public int animalId;
  public char animalgrade;
  public long animalPrice;
  public boolean goodanimal;
  public double animalCub;
  public float dateOfbrith;
  
  public Dog(String animalName,int animalId,char animalgrade,long animalPrice,boolean goodanimal,double animalCub,float dateOfbrith){
	super();
    this.animalName=animalName;
    this.animalId=animalId;
    this.animalgrade=animalgrade;
    this.animalPrice=animalPrice;
    this.goodanimal=goodanimal;
    this.animalCub=animalCub;
    this.dateOfbrith=dateOfbrith;
 	
}
 public void displayDog(){
	System.out.println("about Dog"+this.animalName);
	System.out.println("about Dog"+this.animalId);
	System.out.println("about Dog"+this.animalgrade);
	System.out.println("about Dog"+this.animalPrice);
	System.out.println("about Dog"+this.goodanimal);
	System.out.println("about Dog"+this.animalCub);
	System.out.println("about Dog"+this.dateOfbrith);
    }
 }	