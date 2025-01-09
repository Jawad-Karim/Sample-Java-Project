package oops.polimorphism;

public class Method_overLoading {

	//same method name and signature just different in parameter
	public static double add(int a, double b) {
		return a+b;
	}

	//same method name and signature just different in parameter
	public static double add(double a, double b) {
		return a+b;
	}

	//same method name and signature just different in parameter
	public static double add(int a, int b) {
		return a+b;
	}

	//same method name and signature just different in parameter
	public static double add(int a, int b, double c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {

		//passing different parameter value in different methods
		double result1 = add(6, 7.66);
		double result2 = add(3.00, 4.99);
		double result3 = add(7, 9);
		double result4 = add(4, 5, 6.45);

		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
		System.out.println("result4 : "+ result4);
	}	
}
