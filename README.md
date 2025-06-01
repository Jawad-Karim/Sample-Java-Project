Java basic
----------
// String to other type  
		String s = "400";  
		int i = Integer.parseInt(s);  
		long l = Long.parseLong(s);  
		float f = Float.parseFloat(s);  
		double d = Double.parseDouble(s);  
		Object o = i;  

		String s1 = "Hello";  
		char c = s1.charAt(0);  
		char[] car = s1.toCharArray();  

		String[] sarr = s1.split("");  
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(sarr));  

		String s2 = "true";  
		boolean b = Boolean.parseBoolean(s2);  

		StringBuffer buffer = new StringBuffer(s2);  
		StringBuilder builder = new StringBuilder(s2);  

		// Other type to String  
		int i = 400;  			String s = String.valueOf(i);  
		long l = 400;  			String s = String.valueOf(l);  
		double d = 400.0;  		String s = String.valueOf(d);  
		float f = 400f;  		String s = String.valueOf(f);  
		Object o = 400;  		String s = String.valueOf(o);  
		char c = 'H';  			String s = String.valueOf(c);  
		char[] carr = { 'h', 'i' };  	String s = String.valueOf(carr);  

		StringBuffer sBuffer = new StringBuffer("Hello");   String s = String.valueOf(sBuffer);  
		StringBuffer sBuilder = new StringBuffer("Hello");  String s = String.valueOf(sBuilder);  

		// Array -> ArrayList  
		String[] arr = { "john", "don", "mark", "paul" };  
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));  

		ArrayList<String> aList = new ArrayList<String>();  
		for (String n : arr) list.add(n);  
 
		// ArrayList -> Array  
		String[] s = new String[list.size()];  
		for (int i = 0; i < s.length; i++) {  
			s[i] = list.get(i);  
		}  
		int i = 0;   
		for (String l : list)  s[i++] = l;  

		// Array|ArrayList to Set  
		Set<String> set = new HashSet<>();  
		for (String ar : arr) set.add(ar);  
		for (String lis : list)	set.add(lis);  

		// Set to Array|ArrayList  
		int x = 0;  
		for (String st : set) arr[x++] = st;  
		for (String st : set) list.add(st);  
