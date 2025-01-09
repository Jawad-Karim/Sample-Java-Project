package convert_data_type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Convert_collections {

	public static void main(String[] args) {

		// array to ArrayList ******************************** 
		String[] names = {"john", "don", "mark", "paul"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(names));
		System.out.println(list1);	

		int[] nums = {10, 20, 30, 40};
		ArrayList<Integer> list2 = new ArrayList<>();
		//for(int num : nums) list2.add(num);
		for(int i=0; i<nums.length; i++) {
			list2.add(nums[i]);
		}
		System.out.println(list2);

		//  arrayList to array ************************************
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("tom");
		list3.add("bill");
		list3.add("Joseph");

		String[] arr1 = new String[list3.size()];
		for(int i=0; i<list3.size(); i++) {
			arr1[i] = list3.get(i);
		}
		// list3.toArray(arr1);
		System.out.println(Arrays.toString(arr1));


		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(2);
		list4.add(3);

		int[] arr2 = new int[list4.size()];
		for(int i=0; i<list4.size(); i++) {
			//arr2[i] = list4.get(i);
		}
		// list4.toArray(arr2); not work for int list to int array
		Object[] obj = list4.toArray();
		System.out.println(Arrays.toString(obj));
		
		

		// Set to Array, ArrayList ************************************
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		System.out.println("Contents of Set ::"+set);
		
		String[] myArray = new String[set.size()];
		set.toArray(myArray);
		System.out.println(Arrays.toString(myArray));
		
		ArrayList<String> alist = new ArrayList<>(set);
		System.out.println(alist);
		
		// Array, ArrayList to set *************************************		
		String[] arr3 = {"white", "black", "red", "blue"};
		Set<String> set1 = new HashSet<>();
		Collections.addAll(set1, arr3);
		System.out.println(set1);
		
		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		for(Integer num : list5) set2.add(num);
		System.out.println(set2);
	}
}
