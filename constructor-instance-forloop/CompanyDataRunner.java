class CompanyDataRunner{
  public static void main (String [] args){
  
  CompanyData companyData =new CompanyData();
  
 EmpolyeeData salary1st = new EmpolyeeData(300,"idea");
  EmpolyeeData salary2nd = new EmpolyeeData(400,"vipro");
  EmpolyeeData  salary3rd = new EmpolyeeData(500,"Boss");
  EmpolyeeData salary4rth = new EmpolyeeData(600,"Royal");
  
 EmpolyeeData [] store={salary1st,salary2nd,salary3rd,salary4rth};
  companyData.detalies(store);
  }
} 