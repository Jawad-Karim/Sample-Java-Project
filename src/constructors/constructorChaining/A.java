package constructors.constructorChaining;

// constructor chaining...
public class A {
	
	//constructor without parameter
	public A() {
		System.out.println("hellow world");
	}
	
	//constructor with single integer parameter
	public A(int i) {
		this();
		System.out.println("addition result is : "+ (5+i));
	}
	
	//constructor with string parameter
	public A(String name) {
		this(10);
		System.out.println("name is : "+ name);
	}
	
	//constructor with multiple parameter
	public A(int i, int j) {
		this("jawad");
		System.out.println("multiplication result is : "+ i*j);
	}

}
