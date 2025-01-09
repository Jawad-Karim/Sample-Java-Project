package java_code_challenges;

import java.util.Arrays;

public class Move_all_0s_to_the_end_of_Array {

	public static void main(String[] args) {

		// Write a Java program to move all 0's to the end of an array. 
		//Maintain the relative order of the other (non-zero) array elements.

		int nums[] = {0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1};
		System.out.println("before sorting : "+Arrays.toString(nums));

		int left = 0;
		int right = nums.length-1;

		while(left < right) {
			if(nums[left] == 0 && nums[right] !=0) {

				nums[left] = nums[right];
				nums[right] = 0;
				left++;
				right--;
			}
			else if(nums[left] == 0 && nums[right] == 0){
				right--;
			}
			else if(nums[left] != 0 && nums[right] == 0){
				left++;
				right--;
			}
			else if(nums[left] != 0 && nums[right] !=0){
				left++;
			}
		}
		System.out.println("after sorting : "+Arrays.toString(nums));
	}
}
