class HumanBody{
   public String personName;
   public Head head;
   public Eyes eyes;
   public Hands hands;
public HumanBody(String personName,Head head, Eyes eyes,Hands hands){
  this.personName=personName;
  this.head=head;
  this.eyes=eyes;
  this.hands=hands;
}
public void displayHumanBody(){
   System.out.println("personName="+personName);
   System.out.println("Head="+head.weigthOfBrain);
   System.out.println("Eyes="+eyes.totalEyes);
   System.out.println("Hands="+hands.totalHands);
    }
}
   
  
