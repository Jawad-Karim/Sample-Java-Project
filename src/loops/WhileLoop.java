package loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 60};
		int i = 0;
		
		while(i<array.length) {
			System.out.println(i+". "+array[i]);
			i++;
		}
	}
}
