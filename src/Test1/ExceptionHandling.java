package Test1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	/*	int a=900;
		int b=0;
		
		try
		{
			
		 int result = a/b;
		 System.out.println("After the try :"+ result);
		 
		}catch(ArithmeticException e){
			
			System.out.println("Arithmetic Exception Handled");
	
		}catch(Exception e){
			
			System.out.println("Exception Handled");
		
		}finally {
			
			System.out.println("After all Try & Catch");
		}
		
		System.out.println("Hello");
		System.out.println("After all catch");*/
		
		int myArray[]= {1,4,8,12,16};
		
		try
		{
			System.out.println("Get the 7rd item " +myArray[6]);
		}catch(ArrayOutofBoundaryException e)
		{
			System.out.println("Array out of Boundary handled");
		}
		
		
	}
	}
		
