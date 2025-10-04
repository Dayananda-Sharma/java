class SharathHero extends Hero{

  public String heroName;
  public int heroId;
  public char herograde;
  public long budget;
  public boolean goodHero;
  public double income;
  public float dateOfbrith;
  
  
  public SharathHero(String heroName,int heroId,char herograde,long budget,boolean goodHero,double income,float dateOfbrith){
    super();
    this.heroName=heroName;
	this.heroId=heroId;
	this.herograde=herograde;
	this.budget=budget;
	this.goodHero=goodHero;
	this.income=income;
	this.dateOfbrith=dateOfbrith;
	}
	
 public void displaySharath(){
   System.out.println("About SharathHero"+this.heroName);
   System.out.println("About Hero"+super.heroName);
   System.out.println("About SharathHero"+this.heroId);
   System.out.println("About Hero"+super.heroId);
   System.out.println("About SharathHero"+this.herograde);
   System.out.println("About Hero"+super.herograde);
   System.out.println("About SharathHero"+this.budget);
   System.out.println("About Hero"+super.budget);
   System.out.println("About SharathHero"+this.goodHero);
   System.out.println("About Hero"+super.goodHero);
   System.out.println("About SharathHero"+this.income);
   System.out.println("About Hero"+super.income);
   System.out.println("About SharathHero"+this.dateOfbrith);
   System.out.println("About Hero"+super.dateOfbrith);
    }
  }
 