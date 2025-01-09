package java_code_challenges;

//print the word between two toasts.
public class FindTheStringBetweenTowStrings {

	public static void main(String[] args) {
//********* approach 1 ************
		String str1 =  "sweettoastbuttertoast";
		System.out.println(str1.contains("toast"));
		String sub1 = str1.substring(5,10);
		System.out.println(sub1);

		int toast1 = 0;
		int toast2 = 0;

		for(int i=0; i<str1.length()-4; i++) {
			if(str1.substring(i, i+5).equals("toast")) { //subString index starts 0 wise, ends length number wise
				toast1 = i+5;

				for(int j=i+1; j<str1.length()-4; j++) {
					if(str1.substring(j,j+5).equals("toast")) {
						toast2 = j;
						break;
					}					
				}
				break;
			}
		}
		System.out.println(toast1+" "+ toast2);
		System.out.println(str1.substring(toast1, toast2));
		
		//********** approach 2 **********************************
		String s1 =  "Hellotoastbuttertoast";
		System.out.println(s1);
		
		int toastOccurance1 = -1;
		int toastOccurance2 = -1;
		String sub = "";
		for(int i=0; i<=s1.length()-5; i++){
		  sub = s1.substring(i, i+5);
		  if(sub.equals("toast")){
			    if(toastOccurance1<0) toastOccurance1 = i;
			    else toastOccurance2 = i;
			  }
		}
		String betweenStrings = s1.substring(toastOccurance1+5, toastOccurance2);
		System.out.println("betweenStrings: "+ betweenStrings);
	}
}
