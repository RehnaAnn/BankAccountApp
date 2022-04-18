
public class BankAccountApp {
	
	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking ("Tom", "123456789", 1500);
		Savings saveacc1 = new Savings("Rich Lowe", "123456789", 2500);
		
		saveacc1.showInfo();
		System.out.println("*************");
		chkacc1.showInfo();
		
		
		//read CSV file then create new accounts based on that data
		
	}

}
