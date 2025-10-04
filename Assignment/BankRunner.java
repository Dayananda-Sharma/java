class BankRunner{
 public static void main (String [] args){
  UserName UserName =new UserName("Alphin");
  UserNumber UserNumber =new UserNumber(899999);
  Money Money =new Money(909998);
  UnionBank UnionBank =new UnionBank(5777,Money,UserNumber,UserName);
  Canara Canara =new Canara(5666,Money,UserNumber,UserName);
  Sbi Sbi =new Sbi(5888,Money,UserNumber,UserName);
  Sbi.displaySbi();
  Canara.displayCanara();
  UnionBank.displayUnionBank();
    }
}	