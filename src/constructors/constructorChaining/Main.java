package constructors.constructorChaining;

public class Main extends A{
	
	public Main() {
		
		//all chained constructors will be called
		super(4,5);		
		System.out.println("\nthis is Main class constructor");
	}

	public static void main(String[] args) {
		
		Main m = new Main();

	}

}
