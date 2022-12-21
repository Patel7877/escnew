package dayone.com;


public class ArrayTest {
	public static void main(String[] args) {
		
//		Account accArray[] = new Account[5];
//		
//		System.out.println();
//		
		
		Account accobj= new Account(101,"Vaibhav", 9990);
		
		System.out.println(" Account Details :- "+accobj);
		
		accobj.widrall(500);
		
		System.out.println("\n Account Details After Deposite Ammont :- "+accobj);
		 
		
	}

}


class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private float accountbalance;
	
	
	public Account(int accountNumber, String accountHolderName, float accountbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountbalance = accountbalance;
	}
	float widrall(float amountWidrall) {
		accountbalance=accountbalance-amountWidrall;
		return accountbalance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountbalance=" + accountbalance + "]";
	}
	
	
}
