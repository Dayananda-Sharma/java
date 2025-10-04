class Earth extends Planet{
  public String planetName;
  public int planetNO;
  public char planetFirstLetter;
  public long planetDistance;
  public boolean goodplanet;
  public double totalAnimals;
  public float sizeOfPlanet;
  
  public Earth(String planetName,int planetNO,char planetFirstLetter,long planetDistance,boolean goodplanet,double totalAnimals,float sizeOfPlanet){
    super();
    this.planetName=planetName;
	this.planetNO=planetNO;
	this.planetFirstLetter=planetFirstLetter;
	this.planetDistance=planetDistance;
	this.goodplanet=goodplanet;
	this.totalAnimals=totalAnimals;
	this.sizeOfPlanet=sizeOfPlanet;
	}
	
 public void displayEarth(){
   System.out.println("About Earth"+this.planetName);
   System.out.println("About Planet"+super.planetName);
   System.out.println("About Earth"+this.planetNO);
   System.out.println("About Planet"+super.planetNO);
   System.out.println("About Earth"+this.planetFirstLetter);
   System.out.println("About Planet"+super.planetFirstLetter);
   System.out.println("About Earth"+this.planetDistance);
   System.out.println("About Planet"+super.planetDistance);
   System.out.println("About Earth"+this.goodplanet);
   System.out.println("About Planet"+super.goodplanet);
   System.out.println("About Earth"+this.totalAnimals);
   System.out.println("About Planet"+super.totalAnimals);
   System.out.println("About Earth"+this.sizeOfPlanet);
   System.out.println("About Planet"+super.sizeOfPlanet);
    }
  }
 