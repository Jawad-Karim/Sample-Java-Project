package algorithm;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		
		int[] arr = {40, 30, 20, 70, 90, 60, 10, 50, 100};
		System.out.println("before sorting the array : "+ Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("after sorting the array : "+ Arrays.toString(arr));
	}

}
