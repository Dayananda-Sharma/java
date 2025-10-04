class Shiva extends God{
  public String godName;
  public int godNo;
  public char godFirstLetter;
  public long godDistance;
  public boolean goodGod;
  public double totalControl;
  public float palacesOfGod;
  
  
  public Shiva(String godName,int godNo,char godFirstLetter,long godDistance,boolean goodGod,double totalControl,float palacesOfGod){
    super();
    this.godName=godName;
	this.godNo=godNo;
	this.godFirstLetter=godFirstLetter;
	this.godDistance=godDistance;
	this.goodGod=goodGod;
	this.totalControl=totalControl;
	this.palacesOfGod=palacesOfGod;
	}
	
 public void displayShiva(){
   System.out.println("About Shiva"+this.godName);
   System.out.println("About God"+super.godName);
   System.out.println("About Shiva"+this.godNo);
   System.out.println("About God"+super.godNo);
   System.out.println("About Shiva"+this.godFirstLetter);
   System.out.println("About God"+super.godFirstLetter);
   System.out.println("About Shiva"+this.godDistance);
   System.out.println("About God"+super.godDistance);
   System.out.println("About Shiva"+this.goodGod);
   System.out.println("About God"+super.goodGod);
   System.out.println("About Shiva"+this.totalControl);
   System.out.println("About God"+super.totalControl);
   System.out.println("About Shiva"+this.palacesOfGod);
   System.out.println("About God"+super.palacesOfGod);
    }
  }
 