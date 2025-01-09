package finalization;

public class Finally_keyword {

	public static void main(String[] args) {

		int x = 0;
		int y = 10;

		try {
			System.err.println("result : "+ x/y);
		} 
		catch (Exception e) {
			System.out.println("exception : "+e);
		}
		// no matter try block pass or fail finally block must be executed
		finally {
			System.out.println("this is finally block");
		}
	}
}
