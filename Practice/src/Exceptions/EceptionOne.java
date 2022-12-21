package Exceptions;

public class EceptionOne 
{
	public static void main(String[] args) 
	{
		try 
		{
				int dta=10/2;
				System.out.println(dta);
				System.out.println(" Try Block End ");
				
		}
		catch (ArithmeticException ex) 
		{
			System.out.println(ex);
		}
		System.out.println(" Main IS Over ");
	}
	

}
