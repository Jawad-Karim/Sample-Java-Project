package algorithm;

import java.util.Arrays;

/*
divide the array into two sub array. 
sort and merge back to the main array.
*/

public class MergeSort {

	//create two new arrays and store main one array values into two.
	private static void divide_sort_merge(int[]arr) {

		if (arr.length<2) return;

		int middle = arr.length/2;
		int[] newArr1 = new int[middle];
		int[] newArr2 = new int[arr.length - middle];

		int i=0, j=0, k=0;
		while(i<newArr1.length) newArr1[i++] = arr[k++];
		while(j<newArr2.length) newArr2[j++] = arr[k++];

		divide_sort_merge(newArr1);
		divide_sort_merge(newArr2);
		merge(arr, newArr1, newArr2);
	}

	//sort and store back two array values into one array
	private static void merge(int[] arr, int[] newArr1, int[] newArr2) {		
		int x=0, y=0, z=0;
		while(x<newArr1.length && y<newArr2.length) {
			if(newArr1[x] <= newArr2[y]) arr[z++] = newArr1[x++];
			else arr[z++] = newArr2[y++];				
		}
		while(x<newArr1.length) arr[z++] = newArr1[x++];
		while(y<newArr2.length) arr[z++] = newArr2[y++];
	}

	public static void main(String[] args) {

		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		divide_sort_merge(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("second largest value : "+arr[arr.length-2]);
	}
}