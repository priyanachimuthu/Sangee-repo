package Test1;

public class ThrowExample {

	public static void main(String[] args) {
		
		int Salary = 1000;
		try {
		if(Salary<5000)
		{			
			throw new ArithmeticException("Not Eligible for Loan");
		}

		else
		{			
			System.out.println("Eligible for Loan");
		}
	}catch(ArithmeticException e) {
		
		System.out.println("Arithmetic Exception handled");
	}
		
	}
}
	
