class DetaliesRunner{
 public static void main(String [] args){
   AddharCard AddharCard =new AddharCard(0707);
   Dl Dl =new Dl("Webcamara");
   Pancard Pancard =new Pancard(8676588);
   BankLoan BankLoan =new BankLoan("Bike",Pancard,Dl,AddharCard);
   EMI EMI =new EMI("Sanga",Pancard,Dl,AddharCard);
   GovernmentExam GovernmentExam =new GovernmentExam("IPS-exam",Pancard,Dl,AddharCard);
   GovernmentExam.displayGovernmentExam();
   EMI.displayEMIDetalies();
   BankLoan.displayBankLoanDetalies();
   }
}   