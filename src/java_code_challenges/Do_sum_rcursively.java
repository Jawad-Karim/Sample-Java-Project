package java_code_challenges;

public class Do_sum_rcursively {

	static int sum(int k) {		
		if(k>0) {
			return k + sum(k-1);
		}		
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println("sum of numbers 1 to 15: "+ sum(15));
	}

}
