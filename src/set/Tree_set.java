package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
	/*
	 TreeSet stores element ad sorted in ascending order.
	 null and duplicates are not allowed.
	 */

	public static void main(String[] args) {

		//add values
		Set<String> treeset = new TreeSet<>();
		treeset.add("jawad");
		treeset.add("karim");
		treeset.add("john");

		//print all values
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext()) {
			String text = itr.next();
			System.out.println(text);
		}

		//remove an element
		treeset.remove("john");
		System.out.println(treeset);

		//verify set is empty
		boolean b = treeset.isEmpty();

		//clear treeset
		treeset.clear();

		//check an element present in treeset
		treeset.contains("john");

		//convert treeset to arrayList
		ArrayList<String> list = new ArrayList<>(treeset);
		System.out.println("list : "+list);

	}

}
