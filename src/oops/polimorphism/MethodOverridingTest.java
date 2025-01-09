package oops.polimorphism;

public class MethodOverridingTest {
	
	public static void main(String[] args) {
		
		//creating instance of parent class
		Animal animal = new Animal();
		animal.eat();
		
		//creating instance of cat using the reference of parent class
		Animal cat = new Cat();
		cat.eat();
		
		//creating instance of cat using the reference of parent class
		Animal deer = new Deer();
		deer.eat();
		
		//creating instance of cat using the reference of parent class
		Animal buffalo = new Buffalo();
		buffalo.eat();
		
		//creating a local variable
		int i = 10;
		System.out.println("original value of i : " + i);
		
		//overriding the variable i
		i = 20;
		System.out.println("overridden value of i : "+i);
	}
}
