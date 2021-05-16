package Test1;

public class ThrowsExample {

	public static void main(String[] args) {
		
		ThrowsExample obj =new ThrowsExample();
		
		try {
			
				obj.Eligibility(5100);
			
			}catch(ArithmeticException e) {
			
				System.out.println("Arithmetic Exception handled");
			}		
	}
	
	public void Eligibility(int Salary) throws ArithmeticException{
		
		if(Salary<5000)
		{			
			throw new ArithmeticException("Not Eligible for Loan");
		}

		else
		{			
			System.out.println("Eligible for Loan");
		}
	}

}

