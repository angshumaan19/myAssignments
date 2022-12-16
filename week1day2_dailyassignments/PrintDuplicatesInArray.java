package week1day2_dailyassignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]); //Program is working but this length is printing wrong in line no 12 !!
				
		int count = 0;
	    for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++){
				if (arr[i]==arr[j])
					System.out.println(arr[j]);
				
			}
		}
	    
	}
}
