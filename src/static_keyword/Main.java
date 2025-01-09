package static_keyword;

public class Main {

	public static void main(String[] args) {

		//calling static variable by class name
		System.out.println("static number: "+ StaticMethodVariable.x);
		System.out.println("static message: "+ StaticMethodVariable.s);

		//calling static method by class name
		StaticMethodVariable.display();

		//calling non static variable by object of the class
		StaticMethodVariable sm = new StaticMethodVariable();
		System.out.println("called non static number: "+ sm.y);

		//calling non static method by object of the class
		sm.simple();

		//****************************************************************
		
		//calling inner class method
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass inner = myOuter.new InnerClass();
		inner.innerMethod();

		//calling static inner class method
		OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
		staticInner.StaticInnerMethod();		
	}
}
