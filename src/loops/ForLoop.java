package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 60};
		
		//for loop
		for(int i=0; i<array.length; i++) {
			System.out.println(i+". "+array[i]);
		}
		
		//for each loop
		for(int j : array) {
			
			System.out.println("number: "+ j);
		}

	}

}
