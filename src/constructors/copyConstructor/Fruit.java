package constructors.copyConstructor;

public class Fruit {
	
	private double fprice;  
	private String fname; 
	
	//constructor to initialize roll number and name of the student  
	public  Fruit(double fprice, String fname)  {   
	this .fprice = fprice;  
	this .fname = fname;  
	} 
	
	//creating a copy constructor  
	public  Fruit(Fruit fruit)  {  
	System.out.println("\nAfter invoking the Copy Constructor:\n");  
	this .fprice = fruit.fprice;  
	this .fname = fruit.fname;  
	} 
	
	//creating a method that returns the price of the fruit  
	double showPrice()  {  
	return fprice;  
	} 
	
	//creating a method that returns the name of the fruit  
	String showName()  {  
	return fname;  
	}  

}
