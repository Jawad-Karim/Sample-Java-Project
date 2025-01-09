package java_code_challenges;

import java.util.Arrays;

public class Merge_Two_Arrays {
	
public static void main(String[] args) {
		
		int[] arr1 = {1, 3 , 4, 5, 6, 8, 10, 12};
		int[] arr2 = {2, 4, 7, 9, 11};
		int l = arr1.length+arr2.length;
		
		int[] arr3 = new int[l];
		
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				arr3[k++]=arr1[i++];
			}
			else {
				arr3[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			arr3[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];
		}
		
		System.out.println("merged Array : \n"+Arrays.toString(arr3));
	}

}
