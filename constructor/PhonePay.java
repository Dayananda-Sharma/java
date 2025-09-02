class PhonePay{
    public PhonePay(){
		System.out.println("null");
	}
	 public PhonePay(String name){
		 System.out.println("everyone use=="+name);
	 }
	 public PhonePay(String name,int list){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
	 }
	 public PhonePay(String name,int list,long number){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
		 System.out.println("user number=="+number);
	 }
     public PhonePay(String name,int list,long number,double total){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
		 System.out.println("user number=="+number);
		 System.out.println("total users=="+total);
	 }
      public PhonePay(String name,int list,long number,double total,char letter){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
		 System.out.println("user number=="+number);
		 System.out.println("total users=="+total);
		 System.out.println("total garde=="+letter);
	 }
      public PhonePay(String name,int list,long number,double total,char letter,float date){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
		 System.out.println("user number=="+number);
		 System.out.println("total users=="+total);
		 System.out.println("total garde=="+letter);
		 System.out.println("last Date=="+date);
	 }
	 public PhonePay(String name,int list,long number,double total,char letter,float date,boolean good){
		 System.out.println("everyone use=="+name);
		 System.out.println("total list=="+list);
		 System.out.println("user number=="+number);
		 System.out.println("total users=="+total);
		 System.out.println("total garde=="+letter);
		 System.out.println("last Date=="+date);
		 System.out.println("its feel good=="+good);
	 }

}