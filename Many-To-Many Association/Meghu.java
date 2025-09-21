class Meghu{
 public int obtainedMarks;
	public Java java;
	public Os os;
	public Dbms dbms;
 public Meghu(int obtainedMarks,Java java,Os os,Dbms dbms){
	this.obtainedMarks=obtainedMarks;
    this.java=java;
	this.os=os;
    this.dbms=dbms;
    }
 public void displayMeghu(){
   System.out.println("obtainedMarks:"+obtainedMarks);
	System.out.println("java:"+java.marks);
	System.out.println("Os:"+os.subjectName);
	System.out.println("dbms:"+dbms.domineName);
    }
}