package Intrf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{	Bank b;
		b= new Details("Vaibhav Patel",7877723,7878787,100002.3);
		((Details)b).add_Intrest_Per_Month();
		
		boolean exit=false;

		Scanner sc = new Scanner(System.in);
		while (!exit) 
		{
			System.out.println("Menu : 1.Show Account Number 2.Account Balance 3.Acoount Holder Name 4.Account Id   5.Exit");
			switch (sc.nextInt()) 
			{
			
				case  1: System.out.println("Your Account Number :");
				b.showAccountNumber();
				break;
			
				case 2: System.out.println("Your Account Balance :"); 
				b.showBalance();
				break;
			
				case 3: System.out.println(" Account Holder Name :");
				b.Account_Holder_Name();
				break;
			
				case 4 : System.out.println(" Account Id Is :");
				b.Acoount_Id();
				break;
			
				case 5: exit=true;
				break;
				
			}
		}
		System.out.println(" Thankyou For Visisting Here ");
		sc.close();
	}
}
