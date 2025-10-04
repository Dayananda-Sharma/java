class Building{

 public void bulidingdetailes(Floors [] floors){

	for(int num=0;num<floors.length;num++){
    System.out.println("floors:"+num);
	floors[num].detailes();
	}
 }
	public void RoomsDetalies(Rooms [] rooms){
    for(int num=0;num<rooms.length;num++){
    System.out.println("rooms:"+num);
	rooms[num].displayRooms();
	

    }
 }
}