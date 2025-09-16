class BrandRunner{
 public static void main (String [] args){
  Brand Brand =new Brand();
  Drinks Drinks =new Drinks(110,"coke");
  Drinks Drink =new Drinks(150,"mango");
  Drinks drinks = new Drinks(200,"Sprit");
  Drinks [] inks={drinks,Drink,Drinks};
  Brand.detalies(inks);
   }
 }  