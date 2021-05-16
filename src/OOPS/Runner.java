package OOPS;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassA2 Emp1 = new ClassA2();
		
		ClassA2 Emp = new ClassA2(7000,"Datchi","MS");
		/*Emp.Salary = 7000;
		Emp.Name = "Sangee";
		Emp.CpyName= "FPT";*/
		
		
		//Child
		/*ClassB2 Emp2= new ClassB2();
		
		Emp2.Salary = 6000;
		Emp2.Name = "Sangee";
		Emp2.CpyName= "FPT";
		
		Emp.Disp();
		Emp2.show();
		Emp2.Disp();*/ 
		
		//Grandchild
		
		/*ClassC2 Emp3 = new ClassC2();
		
		Emp3.Salary = 5000;
		Emp3.Name = "lavan";
		Emp3.CpyName= "FPT";
		
			
		Emp3.Disp();
		Emp3.show();
		Emp3.run();	*/
		
	/*	MethodOverloading obj3 = new MethodOverloading();
		
	obj3.add(1, 3);
		obj3.add(1.3, 1.5);*/
		
		/*MethodOverride_Child obj4 = new MethodOverride_Child();
		obj4.disp();
		obj4.disp1(); */
		
		/*AbstractChild obj5 = new AbstractChild();
		obj5.method2();
		obj5.dis();*/
		
		/*InterfaceChild obj6 = new InterfaceChild();
		obj6.method2();*/
		
		EncapsulationClass obj7 = new EncapsulationClass();
		obj7.setSalary(10000);
		System.out.println(obj7.getSalary());
		
		obj7.setEmp_id("S79");
		System.out.println(obj7.getEmp_id());
		
		obj7.setEmp_Name("Sunny");
		System.out.println(obj7.getEmp_Name());
		
		
		
	}
}