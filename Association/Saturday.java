class Saturday{
 public int date;
   Holiday holiday;
   Weekend weekend;
   GodDay godDay;
 public Saturday(int date,Holiday holiday, Weekend weekend,GodDay godDay){
   this.date=date;
   this.holiday=holiday;
   this.weekend=weekend;
   this.godDay=godDay;
   }
 public void displaySaturday(){
   System.out.println("Saturday:"+date);
   System.out.println("holiday:"+holiday.special);
   System.out.println("weekend Trip:"+weekend.dayTrip);
   System.out.println("godDay:"+godDay.godName);
   }
}   
   
   