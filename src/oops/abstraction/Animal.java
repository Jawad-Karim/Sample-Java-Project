package oops.abstraction;

/* Abstraction:
 ----------------------------------------------------------
Abstraction is a way of hiding unnecessary information. 
Abstractions solve problems at the design or interface level. 
The focus of abstraction is “what” to do.
Abstract classes and interfaces can be used to implement abstractions
Abstractions allow access to specific pieces of data.
 */

public abstract class Animal {

	// static final variable
	public static final int x = 10;

	//non static non final variable
	int y = 20;

	//Abstract method
	public abstract void eat();

	//non abstract method
	public void food() {
		System.out.println("food method");
	}

}
