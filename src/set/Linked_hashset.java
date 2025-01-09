package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hashset {
	/*
	 LinkedHashset store elements as node concept. nodes are linked with each other as previous and next node.
	 maintain insertion order. duplicates are not allowed.
	 null allowed only one time.
	 */

	public static void main(String[] args) {

		//add values
		Set<String> linkhashset = new LinkedHashSet<>();
		linkhashset.add("jawad");
		linkhashset.add("karim");
		linkhashset.add("john");

		//print all values
		Iterator<String> itr = linkhashset.iterator();
		while(itr.hasNext()) {
			String text = itr.next();
			System.out.println(text);
		}

		//remove an element
		linkhashset.remove("john");
		System.out.println(linkhashset);

		//verify linkhashset is empty
		boolean b = linkhashset.isEmpty();

		//clear linkhashset
		linkhashset.clear();

		//check an element present in linkhashset
		linkhashset.contains("john");

		//convert linkhashset to arrayList
		ArrayList<String> list = new ArrayList<>(linkhashset);
		System.out.println("list : "+list);
	}
}
