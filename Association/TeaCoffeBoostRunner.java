class TeaCoffeBoostRunner{
 public static void main(String [] args){
 Sugar sugar =new Sugar(5);
 Boost Boost =new Boost(20,"Boost",sugar); 
 Coffe Coffe =new Coffe(1200,"Cold Coffe",sugar);
 Tea Tea =new Tea(15,"Genger Tea",sugar);
 Tea.displayTea();
 Coffe.displayCoffe();
 Boost.displayBoost();
  }
 } 