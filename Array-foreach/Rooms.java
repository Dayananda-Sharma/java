class Rooms{
 public String roomName;
 public int roomSize;
 public char rateing;
 public boolean roomIsGood;
 public long roomPrice;

 public double electricBill;
   public Rooms(String roomName,int roomSize,char rateing,boolean roomIsGood,long roomPrice,double electricBill){
    this.roomName=roomName;
    this.roomSize=roomSize;
    this.rateing=rateing;
    this.roomIsGood=roomIsGood;
    this.roomPrice=roomPrice;
   
    this.electricBill=electricBill;
}	
 public void displayRooms(){
  System.out.println(roomName);
  System.out.println(roomSize);
  System.out.println(rateing);
  System.out.println(roomIsGood);
  System.out.println(roomPrice);
  
  System.out.println(electricBill);
  }
 } 