package week1day2_dailyassignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using method 2
		
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] check = text.toCharArray();
		for (int i = 0; i < check.length; i++) {
			//System.out.println(check[i]);
			
			if (Character.isDigit(check[i]))
				System.out.println(check[i]);
			
		//	if (Character.getNumericValue(check[i])) Stuck in this step
			//	System.out.println();
				
		}
		
	}

}
