package list;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	/*
	 List is used to store group of elements as a single entity. 
	 ArrayList stores elements as array concept and maintain insertion order thru index.
	 retrieve operation faster but insertion and deletion slower because index will be shifted.
	 null and duplicate values are allowed.
	 */

	public static void main(String[] args) {
		
		//declare arrayList
		List<String> list = new ArrayList();
		
		//add values
		list.add("jawad");
		list.add("karim");
		list.add("john");
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(1));
		
		//print elements thru loop
		for(String lis : list) {
			System.out.println(lis);
		}
		
		//overWrite an element
		list.set(2, "paul");
		
		//remover an element
		list.remove(1);
		
		//clear the list
		list.clear();
		
		//check an element available in the list ?
		boolean b = list.contains("karim");
		
	}
}
