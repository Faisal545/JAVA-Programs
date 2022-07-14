//  package pkg2k21b;

public class Customer
{
	private String name;
	private double amount;

	public Customer(String n , double m)
	{
		name=n;
		amount=m;
	}
	
	public void show()
	{
		System.out.println("Name="+ name + ", Amount="+ amount+ "\n");
	}

	public void setName(String n)
	{
		name=n;
	}

	public void setAmount(double m)
	{
		amount=m;
	}

		public String getName()
	{
		return name;			
	}
		
		public double getAmount()
	{
		return amount;			
	}

	// System.out.println("Name="+name);	// Ye comment na krun to error ata hai.
}


 // import pkg2k21b.Customer
public class MainDemopkg2k21b
{
	public static void main(String args[])
	{
		Customer obj=new Customer("Faisal",5000);
		
		obj.show();
		
	
		obj.setName("Ali");
		
		obj.setAmount(100);
		
		obj.show();
	
		String myName=obj.getName();
		double myBalance=obj.getAmount();
			
		System.out.println("Name="+ myName +" \t Amount="+myBalance);


	
	}

}