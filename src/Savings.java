
public class Savings extends Account {
	
	//List properties specific to a checking account
	//Constructor to initialize settings for the Savings properties
	public Savings (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
	}
	//list any methods specific to Savings account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings");
	}

}
