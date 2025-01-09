package algorithm;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {

		int[] arr = {40, 30, 20, 70, 60, 10, 50, 100, 90};
		System.out.println("before sorting array : "+ Arrays.toString(arr));

		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("after sorting array : "+ Arrays.toString(arr));
	}
}
