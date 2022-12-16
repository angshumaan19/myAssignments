package week1day2_dailyassignments;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] test1 = test.toCharArray();
		for (int i = 0; i < test1.length; i++) {
			//System.out.println(test1[i]);
				if (i%2 != 0)
				System.out.println(test1[i]);	
				
				// getting stuck after this
		}
		
	}

}
