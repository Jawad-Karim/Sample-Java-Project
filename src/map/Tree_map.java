package map;

import java.util.TreeMap;

public class Tree_map {
	/*
	 : TreeMap stores elements as key-value pairs as sorted in ascending order.
	 : key can not be null only one time, value can be null multiple time
	 : key can not be duplicate (will be overridden), value can be duplicate.
	 : null key not allowed but null and duplicate values are allowed.
	 */

	public static void main(String[] args) {

		// Create a LinkedHashMap object called capitalCities
		TreeMap<String, String> capitalCities = new TreeMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("Bangladesh", "dhaka");
		capitalCities.put("Bangladesh", "dh");
		capitalCities.put("Banglades", "dhaka");
		capitalCities.put("Finland", "Helsinki");
		capitalCities.put("Australia", null);
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		//output: {Australia=null, Banglades=dhaka, Bangladesh=dh, Finland=Helsinki, USA=Washington DC}

		//access an element
		capitalCities.get("Finland");

		//print all keys
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		//print all values
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + "      value: " + capitalCities.get(i));
		}
		
		// containsKey/Value
		System.out.println("contains USA : "+capitalCities.containsKey("USA"));
		System.out.println("contains null : "+capitalCities.containsValue(null));
		
	}
}
