package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	/*
	 LinkedList stores elements as node concept. nodes are linked with each other as previous and next node.
	 maintain insertion order. null and duplicates are allowed.
	 retrieve operation slower because it search element from first thru last element.
	 insertion and deletion faster because index shifting doesn't take place here.
	 */
	
	public static void main(String[] args) {
		
		List<Integer> linkList = new LinkedList();
		linkList.add(10);
		linkList.add(20);
		linkList.add(30);
		linkList.add(30);
		linkList.add(null);
		
		//print all elements
		for(int i=0; i<linkList.size(); i++) {
			System.out.print(linkList.get(i)+" ");
		}
		
		//create a copy of linked list
		LinkedList<Integer> linkList2 = new LinkedList<>();
		linkList2.addAll(linkList);
		
		//convert to array
		Object[] arr = linkList.toArray();
		System.out.println("\n"+Arrays.toString(arr));
		
		// is element present in the list ? 
		boolean b = linkList.contains(20);
		
		
	}
}
