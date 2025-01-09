package java_code_challenges;

public class FindMaxAndMinValueInArray {

	public static void main(String[] args) {

		int[] arr = {30, 20, 70, 90, 10, 5, 95};

		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("max value is: "+max);

		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("min value is: "+min);
	}
}
