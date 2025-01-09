package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_set {
	/*
	 HashSet stores group of values as set.
	 dosen't maintain insertion order. duplicates are not allowed.
	 null allowed only one time.
	 */

	public static void main(String[] args) {

		//add values
		Set<String> hashset = new HashSet<>();
		hashset.add("jawad");
		hashset.add("karim");
		hashset.add("john");

		//print all values
		Iterator<String> itr = hashset.iterator();
		while(itr.hasNext()) {
			String text = itr.next();
			System.out.println(text);
		}

		//remove an element
		hashset.remove("john");
		System.out.println(hashset);

		//verify set is empty
		boolean b = hashset.isEmpty();

		//clear hashset
		hashset.clear();

		//check an element present in set
		hashset.contains("john");
		
		//convert hashset to arrayList
		ArrayList<String> list = new ArrayList<>(hashset);
		System.out.println("list : "+list);
	}
}
