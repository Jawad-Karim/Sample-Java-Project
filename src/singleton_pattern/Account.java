package singleton_pattern;

// singleton class
public class Account {

	//early instance 
	private static Account account = new Account();	
	private Account() { }	

	public static Account getAccount() {		
		return account;
	}

	public static void myWork() {		
		System.out.println("get my account info");
	}
}
