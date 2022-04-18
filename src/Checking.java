
public class Checking extends Account{
	
	//List properties specific to a checking account
	int debitCardNumber;
	int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+ accountNumber;

	}
	//list any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
	}

}
