package java_code_challenges;

import java.util.HashSet;

public class Swap_2_Values_Without_3rd_Variable {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x = "+ x +", y = "+ y);

		String a = "Hello";
		String b = "World";
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("a = " + a + ", b = " + b);
		
		int[] arr = {1, 2, 3, 2, 4, 5, 3, 4, 4, 1};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);

	}
}
