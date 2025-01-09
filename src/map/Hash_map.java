package map;

import java.util.HashMap;

public class Hash_map {
	/*
	 : Hashmap stores elements as key-value pairs.
	 : key can be null only one time, value can be null multiple time
	 : key can not be duplicate (will be overridden) value can be duplicate.
	 : does not maintain insertion order.
	 */

	public static void main(String[] args) {

		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("Bangladesh", "dhaka");
		capitalCities.put("Bangladesh", "dha");
		capitalCities.put("Banglades", "dhaka");
		capitalCities.put("Finland", "Helsinki");
		capitalCities.put("Australia", null);
		capitalCities.put("USA", "Washington DC");
		capitalCities.put(null, "value for null key");
		System.out.println(capitalCities);
		//output: {null=value for null key, Bangladesh=dha, USA=Washington DC, Banglades=dhaka, Finland=Helsinki, Australia=Sidney}

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
