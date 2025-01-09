package singleton_pattern;

public class TestClass {

	public static void main(String[] args) {
		
		Account ac = Account.getAccount();
		ac.myWork();
		
		Play p = Play.getPlay();
		p.myWork();
	}
}
