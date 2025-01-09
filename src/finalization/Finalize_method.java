package finalization;

public class Finalize_method {

	String s1 = "Hello world";

	//finalize method will clean-up memory occupied by un-reachable, un-usable objects.
	protected void finalize(){
		System.out.println("finalize method cleaned up un-usable data");
	}

	public static void main(String[] args) {
		
		//create object of the class
		Finalize_method fm = new Finalize_method();
		System.out.println(fm.s1);

		//empty the object of the class
		fm = null;

		//calling garbage collector.
		System.gc();
	}
}
