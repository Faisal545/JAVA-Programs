class Employee
{
	double salary ; int wpd;
	
	void getInfo(double a , int b)
	{
		salary=a;
		wpd=b;
	}

	void addSalary()
	{
		if(salary<20000)
		{
		salary=salary+400;
		//System.out.println("Final Salary="+ salary);
		
		}
	}		

	void addWork()
	{
		if(wpd>8)
		{
		salary=salary+600;
		//System.out.println("Final Salary="+ salary);
		}
	}		

}

	public class FinalSalary
	{
		public static void main(String args[])
		{
			Employee emp=new Employee();
			emp.getInfo(4000.0,5);
			emp.addSalary();
			emp.addWork();
		System.out.println("Final Salary="+emp.salary);
		}
	}