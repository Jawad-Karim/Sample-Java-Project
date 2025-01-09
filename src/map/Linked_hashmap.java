package map;

import java.util.LinkedHashMap;

public class Linked_hashmap {		
	/*
	 : Hashmap stores elements as key-value pairs.
	 : key can be null only one time, value can be null multiple time
	 : key can not be duplicate (will be overridden) value can be duplicate.
	 : maintain insertion order.
	 */

	public static void main(String[] args) {

		// Create a LinkedHashMap object called capitalCities
		LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();

		// Add keys and values (Country, City)
				capitalCities.put("Bangladesh", "dhaka");
				capitalCities.put("Bangladesh", "dha");
				capitalCities.put("Banglades", "dhaka");
				capitalCities.put("Finland", "Helsinki");
				capitalCities.put("Australia", null);
				capitalCities.put("USA", "Washington DC");
				capitalCities.put(null, "value for null key");
				System.out.println(capitalCities);
				//output: {Bangladesh=dha, Banglades=dhaka, Finland=Helsinki, Australia=null, USA=Washington DC, null=value for null key}
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