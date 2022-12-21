package BankS;

public class CentralBank implements bankEligblity {
	
	private String Branch_Name;
	private String Account_Holder_Name;
	private int Account_Number;
	private int ISFC_Code;
	private int Costumer_Rating;
	
	
	
	public String getBranch_Name() {
		return Branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}
	public String getAccount_Holder_Name() {
		return Account_Holder_Name;
	}
	public void setAccount_Holder_Name(String account_Holder_Name) {
		Account_Holder_Name = account_Holder_Name;
	}
	public int getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}
	public int getISFC_Code() {
		return ISFC_Code;
	}
	public void setISFC_Code(int iSFC_Code) {
		ISFC_Code = iSFC_Code;
	}
	public int getCostumer_Rating() {
		return Costumer_Rating;
	}
	public void setCostumer_Rating(int costumer_Rating) {
		Costumer_Rating = costumer_Rating;
	}
	public CentralBank() {
	
	}
	public CentralBank(String branch_Name, String account_Holder_Name, int account_Number, int iSFC_Code,
			int costumer_Rating) {
		super();
		Branch_Name = branch_Name;
		Account_Holder_Name = account_Holder_Name;
		Account_Number = account_Number;
		ISFC_Code = iSFC_Code;
		Costumer_Rating = costumer_Rating;
	}


	@Override
	public void Rating_fo_Branch() {
		int rating=getCostumer_Rating();
		System.out.println(" *Costumer Rating Of Central Bank Is : " + rating);
	}

	@Override
	public void ShowBranche() {
		String branch=getBranch_Name();
		System.out.println(" *Branch : " + branch);
	}

	@Override
	public void Show_Details_of_Costumer() {
		String name=getAccount_Holder_Name();
		int accountnumber=getAccount_Number();
		int isfc=getISFC_Code();
		System.out.println(" *Account Holder Name : " + name + "\n *Account Number : " + accountnumber +
				"\n *ISFC Code : " + isfc );
	}
	@Override
	public String toString() {
		return "CentralBank [Branch_Name=" + Branch_Name + ", Account_Holder_Name=" + Account_Holder_Name
				+ ", Account_Number=" + Account_Number + ", ISFC_Code=" + ISFC_Code + ", Costumer_Rating="
				+ Costumer_Rating + "]";
	}
	

		
	}


