
public abstract class Account implements IBaseRate{
	
	//list common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;
	static int index =10000;
	String accountNumber;
	double rate;
	
	//constructor to set base properties and initialize the account
	public Account (String name, String sSN, double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;
		
		//set account number
		this.accountNumber = setAccountNumber();
	}
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID =index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	//list common methods
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance
				);
	}
	

}
