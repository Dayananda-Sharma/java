class EBook extends Book{
 public static void displayEBook(){
	System.out.println(bookName);
    bookName="Story book";
	System.out.println(bookName);
	
 }
	
 public void displayPrice(){
    price=100;
	System.out.println(price);	 
	displayBook();
 }	
}