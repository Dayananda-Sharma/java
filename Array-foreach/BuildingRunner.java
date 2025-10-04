class BuildingRunner{
public static  void main (String [] args){

 Building Building = new Building();
 Floors floor1 =new Floors(1,"Sattva");
 Floors floor2 =new Floors(2,"Lcu");
 Floors [] floors={floor1,floor2};
 Building.bulidingdetailes(floors);
 
 Rooms Rooms =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room1 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room2 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room3 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room4 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room5 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room6 =new Rooms("Royal",40,'A',true,50000,2000.0);
 Rooms Room7 =new Rooms("Royal",40,'A',true,50000,2000.0);
 
   Rooms [] room={Rooms,Room1,Room2,Room3,Room4,Room5,Room6,Room7};
   Building.RoomsDetalies(room);
 
 }
 }
 