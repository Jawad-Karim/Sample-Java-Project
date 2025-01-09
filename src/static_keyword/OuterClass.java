package static_keyword;

public class OuterClass {

	public class InnerClass {

		public void innerMethod() {
			System.out.println("this is inner class method");
		}
	}

	static class StaticInnerClass {

		public void StaticInnerMethod() {
			System.out.println("this is static inner class method");
		}
	}
}
