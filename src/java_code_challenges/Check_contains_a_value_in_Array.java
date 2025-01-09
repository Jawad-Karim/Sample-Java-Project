package java_code_challenges;

public class Check_contains_a_value_in_Array {

	public static void main(String[] args) {

		// Java program to test if an array contains a specific value.

		int[] myNum = {40, 30, 20, 70, 90, 60, 10, 50, 100};
		int searchItem = 90;

		for(int i=0; i<myNum.length; i++) {
			if(myNum[i] == searchItem) {
				System.out.println("array contains : "+searchItem);
				break;
			}
		}
	}
}
