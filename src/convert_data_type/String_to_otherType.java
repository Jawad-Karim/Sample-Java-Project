package convert_data_type;

import java.util.ArrayList;
import java.util.Arrays;

public class String_to_otherType {

	public static void main(String[] args) {
		
		String s = "400";
		int i = Integer.parseInt(s);
		System.out.println("String to Integer value: "+ i);
		
		Long l = Long.parseLong(s);
		System.out.println("String to Long: "+ l);
		
		Float f = Float.parseFloat(s);
		System.out.println("String to Float: "+ f);		
		
		Double d = Double.parseDouble(s);
		System.out.println("String to Doble: "+ d);
		
		Object o = s;
		System.out.println("String to Object: "+ o);
		
		String s1="Hello";
		
		char c=s1.charAt(0);
		System.out.println("String to character: "+ c);
		
		char[] charArray = s1.toCharArray();
		System.out.println("String to Object: "+ Arrays.toString(charArray));
		
		String[] array = s1.split("");
		System.out.println("String to array: "+ Arrays.toString(array));
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		System.out.println("Array to ArrayList: "+ list);
		
		String s2 = "true";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);
		
		StringBuffer sb = new StringBuffer(s);
		StringBuilder sb2 = new StringBuilder(s);
		System.out.println(sb2);
	}

}
