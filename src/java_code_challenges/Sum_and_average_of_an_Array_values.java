package java_code_challenges;

public class Sum_and_average_of_an_Array_values {

	public static void main(String[] args) {

		// Java program to sum values and average of an array.
		int[] num = {40, 30, 20, 70, 90, 60, 10, 50, 100};
		int sum = 0;

		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : "+ sum);
		System.out.println("average : "+ sum/num.length);
	}
}
