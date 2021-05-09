package OOPS;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA2 Emp1 = new ClassA2();
		
		ClassA2 Emp = new ClassA2(7000,"Datchi","MS");
		/*Emp.Salary = 7000;
		Emp.Name = "Sangee";
		Emp.CpyName= "FPT";*/
		
		
		//Child
		ClassB2 Emp2= new ClassB2();
		
		Emp2.Salary = 6000;
		Emp2.Name = "Sangee";
		Emp2.CpyName= "FPT";
		
		Emp.Disp();
		Emp2.show();
		Emp2.Disp(); 
		
		//Grandchild
		
		ClassC2 Emp3 = new ClassC2();
		
		Emp3.Salary = 5000;
		Emp3.Name = "lavan";
		Emp3.CpyName= "FPT";
		
			
		Emp3.Disp();
		Emp3.show();
		Emp3.run();
		
		

	}
}