class Books{
 public String bookName;
 public int price;
 public Page page;
 
 public Books(String bookName,int price, Page page){
	this.bookName=bookName;
	this.price=price;
	this.page=page;
	
     }
	public void displayBook(){
		
    System.out.println("bookName="+bookName+price);
    System.out.println("price="+page.name);
    System.out.println("page page="+page.totalBooks);
	
    }

}