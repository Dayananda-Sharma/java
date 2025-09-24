class Son extends Father{

public static void displayName(){
	
	System.out.println(fatherName);
	System.out.println(age);
	fatherName="Raju";
	age=60;
	System.out.println(fatherName);
	System.out.println(age);
	 displayFather();
}
 public void displayAge(){
    System.out.println(fatherName);
	
	fatherName="king";
	age=70;
	System.out.println(fatherName);
	System.out.println(age);
   
  }
} 