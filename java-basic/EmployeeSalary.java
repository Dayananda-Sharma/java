class EmployeeSalary{
	public static void main (String [] args ){
		double itSalary=40000;
		double policeSalary=35000;
		double teacher=25000;
		double pgOwnerIncome=70000;
		
		double [] income ={itSalary,policeSalary,teacher,pgOwnerIncome};
		System.out.println( income [3] );
		
		double busdriver=40000;
		income [3] = busdriver;
		System.out.println( income [3] );
		
		System.out.println(" Employee salary");
		
		for ( double salary=0; salary <income.length; salary++)
			System.out.println( income [(int) salary]  );
	}
}
	
		