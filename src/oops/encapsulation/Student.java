package oops.encapsulation;
/* Encapsulation:
-----------------------------------------------------------------
It is a way of hiding the implementation details by encaptulating data and method as a single entity & unit. 
Encapsulation solve the problems at implementation level.
The focus of encapsulation is “how” to do.
It can be implemented using access modifiers, i.e. private, protected, public. & setter|getter method.
It hides data from direct access by users (data hiding).
 */

public class Student {
	
	private String name;
	private int age;
	
	//Encapsulation
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
