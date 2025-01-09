package java_code_challenges;

import java.util.ArrayList;
import java.util.List;

public class FiboncciSeriesAndPrime {

	public static void main(String[] args) {

//FibonacciSeries number is a number-series where each number is a sum of two preceding numbers.
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(n1);
		fibonacci.add(n2);
		
		for(int i=2; i<10; i++) {
			sum = n1+n2;
			fibonacci.add(sum);
			n1 = n2;
			n2 = sum;
		}
		System.out.println(fibonacci);
	}
}
