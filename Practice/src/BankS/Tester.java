package BankS;

import java.util.Scanner;

public class Tester {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
{
		bankEligblity b= new CentralBank("Central Bank","Vaibhva Patel",7877,234,6);
		
		bankEligblity b1=new HDFC("HDFC BANK","Yougal patil",8286,7899,8);
		
		bankEligblity b2=new ICICI("ICIC BANK", "Abhishak Patil",9090,7098,9);
		
		bankEligblity b3=new SBI("SBI BANK","Vishvnath Patel",56768,1919,10);
		
		bankEligblity b4=new Bab_Of_Baroda("Bnk of Baroda","Hiralal Pati",1345,676,9);
		
		boolean f=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose Bank : \n# 1] Central Bank  \n# 2] HDFC  \n# 3] ICIC  \n# 4] SBI  \n# 5] Bank of Baroda  \n# 6] Exit");
		while(!f) {
		switch(sc.nextInt()) 
		{
			case 1 : System.out.println(" Your Choice is Excellent ");
			boolean g=false;
			while(!g) 
			{
				System.out.println("Chosse : \n ~1]Acount Detils  \n ~2]Show You Chossen Brach  \n ~3]Coustomer Ratin Youare Visiting  \n ~4]Exit");
						
				switch(sc.nextInt())
				{
					case 1: b.Show_Details_of_Costumer();
					break;
					case 2: b.ShowBranche();
					break;
					case 3: b.Rating_fo_Branch();
					break;
					case 4: g=true;
					break;
				}
			}
			break;
			
			case 2 : System.out.println(" Your Choice is Excellent ");
			boolean gs=false;
			while(!gs) 
			{
				System.out.println("Chosse : \n ~1]Acount Detils  \n ~2]Show You Chossen Brach  \n ~3]Coustomer Ratin Youare Visiting  \n ~4]Exit");
						
				switch(sc.nextInt())
				{
					case 1: b.Show_Details_of_Costumer();
					break;
					case 2: b.ShowBranche();
					break;
					case 3: b.Rating_fo_Branch();
					break;
					case 4: gs=true;
					break;
				}
			}
			break;
			
			case 3 : System.out.println(" Your Choice is Excellent ");
			boolean gd=false;
			while(!gd)
			{
				System.out.println("Chosse : \n ~1]Acount Detils  \n ~2]Show You Chossen Brach  \n ~3]Coustomer Ratin Youare Visiting  \n ~4]Exit");
						
				switch(sc.nextInt())
				{
					case 1: b.Show_Details_of_Costumer();
					break;
					case 2: b.ShowBranche();
					break;
					case 3: b.Rating_fo_Branch();
					break;
					case 4: gd=true;
					break;
				}
			}
			break;
			
			case 4 : System.out.println(" Your Choice is Excellent ");
			boolean gf=false;
			while(!gf) 
			{
				System.out.println("Chosse : \n ~1]Acount Detils  \n ~2]Show You Chossen Brach  \n ~3]Coustomer Ratin Youare Visiting  \n ~4]Exit");
						
				switch(sc.nextInt())
				{
					case 1: b.Show_Details_of_Costumer();
					break;
					case 2: b.ShowBranche();
					break;
					case 3: b.Rating_fo_Branch();
					break;
					case 4: gf=true;
					break;
				}
			}
			break;
			
			case 5 : System.out.println(" Your Choice is Excellent ");
			boolean gg=false;
			while(!gg) 
			{
				System.out.println("Chosse : \n ~1]Acount Detils  \n ~2]Show You Chossen Brach  \n ~3]Coustomer Ratin Youare Visiting  \n ~4]Exit");
						
				switch(sc.nextInt())
				{
						case 1: b.Show_Details_of_Costumer();
						break;
						case 2: b.ShowBranche();
						break;
						case 3: b.Rating_fo_Branch();
						break;
						case 4: gg=true;
						break;
				}
			}
			break;
			case 6: f=true;
			break;
		}
		}
		sc.close();
	}
}
