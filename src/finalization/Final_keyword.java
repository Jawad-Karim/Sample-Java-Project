package finalization;

public class Final_keyword {

	// final variable can not be overridden
	final int x = 10;

	// final method can not be overridden
	final void play() {
		System.out.println("this is final method");
	}
	//**************************************************************************************

	/* a final class can not be inherited by a sub class but it can extends a parent class.
	   it means final class can be a child class, but can not be a parent class.   */	

	class Parent { }
	final class Game extends Parent{ }
}
