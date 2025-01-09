package java_code_challenges;

public class FindMissingElementInArray {

	public static void main(String[] args) {

		//array should not have duplicates
		//array no need to be in sorted order
		//values should be in range
		/*logic...
		 int sum1 = 1+2+4+5
		 int sum2 = 1+2+3+4+5
		 int missing number = sum2 - sum1
		 */
		int[] a = {1,2,3,5};
		int sum1 = 0;
		for(int i=0; i<a.length; i++) {
			sum1 += a[i];
		}
		System.out.println("total of the array: "+sum1);

		int sum2 = 0;
		for(int i=1; i<=5; i++) {
			sum2 += i;
		}
		System.out.println("total of range values: "+ sum2);
		System.out.println("missing number is: "+ (sum2 - sum1));
	}
}
