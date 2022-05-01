package week1.day2.classroom;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
				int[] nums = {1,2,3,8,9,4,5,6,7};
				Arrays.sort(nums);
				for (int i = 1; i < nums.length; i++) {
					System.out.println(i);
				}
	}
}