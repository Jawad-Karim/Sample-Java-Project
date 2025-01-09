package oops.encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		//set the name and print the name
		s1.setName("jawad");
		System.out.println("student name : "+s1.getName());
		
		//get the age and print the age
		s1.setAge(33);
		System.out.println("student age : "+s1.getAge());
	}

}
