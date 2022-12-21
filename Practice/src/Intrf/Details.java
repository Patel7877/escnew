package Intrf;

public class Details implements Bank {
	
	String AcountHolderName;
	int bankId;
	int accountnumber;
	double balance;
		
	
	
	public Details() 
	{
		super();
		this.AcountHolderName="UnKnown";
		this.bankId=000;
		this.accountnumber=000;
		this.balance=000.0;
	}
	
	

	public Details(String acountHolderName, int bankId, int accountnumber, double balance) {
		super();
		AcountHolderName = acountHolderName;
		this.bankId = bankId;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}



	public String getAcountHolderName() {
		return AcountHolderName;
	}

	public void setAcountHolderName(String acountHolderName) {
		AcountHolderName = acountHolderName;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void add_Intrest_Per_Month() {
		double a= 30 + getBalance();
		System.out.println(a);
	}
	
	
	@Override
	public void showAccountNumber() 
	{
		int s=getAccountnumber();
		System.out.println(s);
	}

	@Override
	public void showBalance() {
		double d=getBalance();
		System.out.println(d);
	}



	@Override
	public void Account_Holder_Name() 
	{
		String a=getAcountHolderName();
		System.out.println(a);
	}



	@Override
	public void Acoount_Id() 
	{
		int a= getBankId();
		System.out.println(a);
	}

}
