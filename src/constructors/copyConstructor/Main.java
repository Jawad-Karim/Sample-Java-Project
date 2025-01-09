package constructors.copyConstructor;

public class Main {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit(399, "Ruby Roman Grapes");  
		System.out.println("Name of the first fruit: "+ f1.showName());   //Ruby Roman Grapes
		System.out.println("Price of the first fruit: "+ f1.showPrice()); //399
		
		//passing the parameters to the copy constructor  
		Fruit f2 = new Fruit(f1);  
		System.out.println("Name of the second fruit: "+ f2.showName());   //Ruby Roman Grapes
		System.out.println("Price of the second fruit: "+ f2.showPrice()); //399
	}
}
