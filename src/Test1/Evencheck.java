package Test1;

import java.util.Scanner;

public class Evencheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		do
		{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What is your number:");
		
		b = scanner.nextInt();
		
		if(b/2 !=0)
		{
			System.out.println("Not Even");
		}
		else
		{
			System.out.println("Even");	
		}

        }while (b!=0);
}

}	
	

