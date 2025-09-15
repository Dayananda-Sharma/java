class ApartmentRunner{
public static  void main (String [] args){

 Apartment apartment = new Apartment();
 Floors floor1 =new Floors(1,"Sattva");
 Floors floor2 =new Floors(2,"Lcu");
 Floors [] floors={floor1,floor2};
 apartment.bulidingdetailes(floors);
 
 
 }
 }
 