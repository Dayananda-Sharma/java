class PeterEngland{
   public PeterEngland(){
   this(1400);
 }
   public PeterEngland(int price){
   this(14000,"Shrit");
 }
   public PeterEngland(int price,String name){
   this(14000,"Shrit",500);
 }
   public PeterEngland(int price,String name,long discount){
	   this(14000,"Shrit",500,'A');
 }
    public PeterEngland(int price,String name,long discount,char brand){
	   this(14000,"Shrit",500,'A',10f);
 }
    public PeterEngland(int price,String name,long discount,char brand,float rateing){
	   this(14000,"Shrit",500,'A',10f,true);
 }	   
	public PeterEngland(int price,String name,long discount,char brand,float rateing,boolean good){
	   this(14000,"Shrit",500,'A',10f,true,0.2);   
 }	   

     public PeterEngland(int price,String name,long discount,char brand,float rateing,boolean good,double best){
		System.out.println(price);
		System.out.println(name);
		System.out.println(discount);
		System.out.println(brand);
		System.out.println(rateing);
		System.out.println(good);
		System.out.println(best);
	 }
}
		