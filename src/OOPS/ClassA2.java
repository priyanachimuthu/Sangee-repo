package OOPS;

public class ClassA2 {
	
	protected int Salary;
	public String Name;
	public String CpyName;
	
	//Simple Constructor
	public ClassA2()
	{
		System.out.println("This is a Constructor");
	}
	
	//Constructor with Paramtere
	public ClassA2(int val1,String val2,String val3)
	{
		System.out.println("This is a Parameter Constructor");
		
		this.Salary = val1;
		this.Name = val2;
		this.CpyName = val3;
	}
	
	//Method 	
	public void Disp()
	{
		System.out.println("Enter the Salary: "+ Salary);
		System.out.println("Enter Name: "+ Name);
		System.out.println("Enter the CpyName: "+ CpyName);
	}	
	

}
