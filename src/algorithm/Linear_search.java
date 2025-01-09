package algorithm;

public class Linear_search {


	public static void searchItem(int search_item) {

		int[] arr = {40, 30, 20, 70, 90, 60, 10, 50, 100};

		for (int i=0; i<arr.length; i++) {
			if(arr[i] == search_item) {
				System.out.println("search item "+arr[i]+" found at position : "+i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		searchItem(40);
	}

}
