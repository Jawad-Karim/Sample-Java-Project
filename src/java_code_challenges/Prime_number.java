package java_code_challenges;

import java.util.ArrayList;

public class Prime_number {

	public static void main(String[] args) {

		// Prime number has two factors 1 and itself only
		int num = 19;
		String status = " is a prime number";
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				status = " is not a prime number";
				break;
			}
		}
		System.out.println(num + status);

//***********************************************************************
		//find prime number 1-100
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i; j++) {
				if(i == j) {
					primes.add(j);					
				}
				if(i%j == 0) {
					break;
				}
			}
		}
		System.out.println(primes);
	}
}
