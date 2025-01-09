package singleton_pattern;

// singleton class
public class Play {
	
	private static Play play;	
	private Play() { }
	
	public static Play getPlay() {		
		play = new Play();  // lazy instance
		return play;
	}
	
	public static void myWork() {		
		System.out.println("get the player info");
	}
	
}
