package oops.instance_of_class;

import java.util.ArrayList;

public class Student_test_class {

	public static void main(String[] args) {

		Student s1 = new Student("jawad", 34, 0021);
		Student s2 = new Student("karim", 35, 0022);

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		System.out.println(list);

		for(Student student : list) {		
			System.out.println("name : "+student.name+"   age : "+student.age+"   ID : "+student.id);
		}
	}
}
