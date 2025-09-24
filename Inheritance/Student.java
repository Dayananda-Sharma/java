class Student extends Person{
	
 public static void displayStudent(){
	System.out.println(studentName);
    studentName="Kiran";
	System.out.println(studentName);
	
 }
	
 public void displayid(){
    idNum=100;
	System.out.println(idNum);	 
	displayPerson();
 }	
}