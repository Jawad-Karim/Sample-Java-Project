package static_keyword;

public class StaticMethodVariable {

	/*  static method and variable belong to the class, not to the object of the class.
	 static method and variable will be called by class name
	 */

	//static variable
	static int x = 30;
	static String s = "Hello";

	//static method
	public static void display() {
		System.out.println("this is static method");
	}

	//non static variable
	int y = 40;
	String text = "Hello world";

	// non static method
	public void simple() {
		System.out.println("this is simple method");
	}

}
