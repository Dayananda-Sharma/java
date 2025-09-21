class StudentsRunner{
	public static void main(String [] args){
	Dbms dbms =new Dbms("Data Base Manegment System");	
	Os os =new Os("opreator System");
    Java java =new Java(67);	
	
	Prasad prasad =new Prasad(500,java,os,dbms);
    Kiran kiran =new Kiran(600,java,os,dbms);	
	Meghu meghu =new Meghu(700,java,os,dbms);
	
	prasad.displayPrasad();
	kiran.displayKiran();
	meghu.displayMeghu();
	 }
}	