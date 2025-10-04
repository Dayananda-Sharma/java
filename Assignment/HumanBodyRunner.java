class HumanBodyRunner{
 public static void main(String [] args){
  Hands hands =new Hands(2);
  Eyes Eyes =new Eyes(2);
  Head Head =new Head(200);
  HumanBody HumanBody =new HumanBody("Sharath",Head,Eyes,hands);
  HumanBody.displayHumanBody();
   }
 }  