class SaturdayRunner{
 public static void main(String [] args){
  GodDay godDay =new GodDay("Tirupati");
  Weekend weekend =new Weekend("Nandi hills");
  Holiday holiday =new Holiday("Every one likes");
  Saturday Saturday =new Saturday(27,holiday,weekend,godDay);
  Saturday.displaySaturday();
  }
 } 