class SalarayDetaliesRunner{
  public static void main (String [] args){
  
  SalarayDetalies salarayDetalies =new SalarayDetalies();
  
  ItEmployeData salary1st = new ItEmployeData(300,"idea");
  ItEmployeData salary2nd = new ItEmployeData(400,"vipro");
  ItEmployeData  salary3rd = new ItEmployeData(500,"Boss");
  ItEmployeData salary4rth = new ItEmployeData(600,"Royal");
  
 ItEmployeData [] amount={salary1st,salary2nd,salary3rd,salary4rth};
  salarayDetalies.detalies(amount);
  }
} 