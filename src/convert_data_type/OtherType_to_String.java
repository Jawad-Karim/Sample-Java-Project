package convert_data_type;

public class OtherType_to_String {

	public static void main(String[] args) {
		
		int i = 400;
		String s1 = String.valueOf(i);
		System.out.println("integer to String: "+ s1);
		
		long l = 400;
		String s2 = String.valueOf(l);
		System.out.println("long to String: "+ s2);
		
		float f = 300f;
		String s3 = String.valueOf(f);
		System.out.println("long to String: "+ s3);
		
		
		double d = 400.00;
		String s4 = String.valueOf(d);
		System.out.println("double to String: "+ s4);
		
		Object o = 400;
		String s5 = String.valueOf(o);
		System.out.println("long to String: "+ s5);
		
		char c = 'H';
		String s6 = String.valueOf(c);
		System.out.println("long to String: "+ s6);
		
		char[] charArray = {'h','e','l','l','o'};
		String s7 = String.valueOf(charArray);
		System.out.println("long to String: "+ s7);
				
		String[] array = {"h","e","l","l","o"};
		String s8 = "";
		for(int j=0; j<array.length; j++) {
			s8 += array[j];
		}
		System.out.println("long to String: "+ s8);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s9 = String.valueOf(sb);
		//String s9 = sb.toString();
		System.out.println(s9);
	}
}
