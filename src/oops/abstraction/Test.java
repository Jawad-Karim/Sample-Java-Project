package oops.abstraction;

public class Test  extends Animal{
	
	//body is provided here.
		public void eat() {
			System.out.println("eat method");		
		}	

	public static void main(String[] args) {

		Test t = new Test();

		//t.x = 30  	overWriting not possible
		// variable y is overWritten here.
		t.y = 30;

		System.out.println("x : "+t.x);
		System.out.println("y : "+t.y);

		//calling abstract method
		t.eat();

		//calling non abstract method
		t.food();
	}

	

}
