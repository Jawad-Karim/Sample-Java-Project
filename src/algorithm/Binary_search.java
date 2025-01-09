package algorithm;

public class Binary_search {


	public static void searchItem(int search_item) {

		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		int first = -1;
		int last = arr.length;
		int middle;

		while(first<last) {
			middle = (first+last)/2;
			System.out.println("middle: "+ middle);
			if(search_item == arr[middle]) {
				System.out.println("search item: "+arr[middle]+" found at index: "+middle);
				break;
			}
			else if(search_item > arr[middle]) {
				first = middle;
			}
			else {
				last = middle;
			}
		}
	}

	public static void main(String[] args) {
		searchItem(20);

	}
}
